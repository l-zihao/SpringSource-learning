package com.lin.invocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/8 17:11
 */
public class MyInvocationHandler implements InvocationHandler {

	Object target;

	public MyInvocationHandler(Object target){
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("proxy");
		return method.invoke(target, args);
	}
}
