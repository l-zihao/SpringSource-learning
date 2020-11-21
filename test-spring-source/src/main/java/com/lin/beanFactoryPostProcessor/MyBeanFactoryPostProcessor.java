package com.lin.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/7 16:37
 */
/*@Component*/
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AnnotatedBeanDefinition annotatedBeanDefinition
				= (AnnotatedBeanDefinition) beanFactory.getBeanDefinition("indexDao");
		annotatedBeanDefinition.setScope("prototype");
	}
}
