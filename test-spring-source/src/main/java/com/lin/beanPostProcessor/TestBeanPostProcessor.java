package com.lin.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * BeanPostProcessor插手bean的实例化过程
 * PriorityOrdered改变bean初始化顺序，值越小越先
 * @author Lin
 * @version 1.0
 * @date 2020/8/7 12:01
 */
/*@Component*/
public class TestBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {


	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("indexDao")){
			System.out.println("BeforeInitialzation");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("indexDao")){
			System.out.println("AfterInitialization");
		}
		return bean;
	}

	@Override
	public int getOrder() {
		return 100;
	}
}
