package com.lin.factoryBean;

import com.lin.anno.MySelect;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/8 11:40
 */

/**
 * 通过传一个Class clazz对象构造一个MyFactoryBean
 * getObject可以返回一个通过JDK动态代理生成的实现clazz接口的代理对象
 */
public class MyFactoryBean implements FactoryBean, InvocationHandler {

	private Class clazz;

	public MyFactoryBean(Class clazz){
		this.clazz = clazz;
	}

	@Override
	public Object getObject() throws Exception {
		Class[] clazzs = new Class[]{clazz};
		Object proxy = Proxy.newProxyInstance(this.getClass().getClassLoader(), clazzs, this);
		return proxy;
	}

	@Override
	public Class<?> getObjectType() {
		return clazz;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("proxy");
		//获取@MySelect里的sql语句
		Method method1 = proxy.getClass().getInterfaces()[0].getMethod(method.getName(), String.class);
		MySelect mySelect = method1.getDeclaredAnnotation(MySelect.class);
		System.out.println(mySelect.value());
		return null;
	}
}
