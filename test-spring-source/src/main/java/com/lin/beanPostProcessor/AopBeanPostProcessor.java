package com.lin.beanPostProcessor;

import com.lin.dao.Dao;
import com.lin.invocationHandler.MyInvocationHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

/**
 * 通过MyImportSelector注入到spring容器中，不需要加@Component注解
 * @author Lin
 * @version 1.0
 * @date 2020/8/7 10:50
 */
/*@Component*/
public class AopBeanPostProcessor implements BeanPostProcessor {

	public void query(){
		System.out.println("query");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("indexDao")){
			bean = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{Dao.class}, new MyInvocationHandler(bean));
		}
		//返回代理对象
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}
