package com.lin.methodCallback;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/9 17:16
 */
public class TestMethodCallback implements MethodInterceptor {
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("intercept");
		methodProxy.invokeSuper(o, objects);
		return null;
	}
}
