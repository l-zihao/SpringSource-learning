package com.lin.importBeanDefinitionRegister;

import com.lin.dao.CardDao;
import com.lin.factoryBean.MyFactoryBean;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/8 11:22
 */

public class MyImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		/*CardDao dao = (CardDao) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{CardDao.class}, new MyInvocationHandler());
		dao.list();*/
		//扫描所有接口，这里写死了
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(CardDao.class);
		//获得beanDefinition
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanDefinitionBuilder.getBeanDefinition();
		/**
		 * CardDao是一个接口，注册时无法实例化一个bean
		 * setBeanClass(MyFactoryBean.class)设置beanDefinition为MyFactoryBean
		 * 由于MyFactoryBean构造方法需要一个Class clazz
		 * getConstructorArgumentValues().addGenericArgumentValue("com.lin.dao.CardDao")
		 * 设置MyFactoryBean构造方法需要的值
		 */
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.lin.dao.CardDao");
		beanDefinition.setBeanClass(MyFactoryBean.class);
		/**
		 * 注册beanDefinition
		 * cardDao --- 实现cardDao的代理对象
		 * &cardDao --- MyFactoryBean
		 */
		registry.registerBeanDefinition("cardDao", beanDefinition);
	}
}
