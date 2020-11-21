package com.lin.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/7 12:01
 */
/*@Component*/
public class TestBeanPostProcessor1 implements BeanPostProcessor, PriorityOrdered {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("indexDao")){
			System.out.println("BeforeInitialzation1");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("indexDao")){
			System.out.println("AfterInitialization1");
		}
		return bean;
	}

	@Override
	public int getOrder() {
		return 1;
	}
}
