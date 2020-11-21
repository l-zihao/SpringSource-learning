package com.lin.test;

import com.lin.app.Appconfig;
import com.lin.beanFactoryPostProcessor.MyBeanFactoryPostProcessor;
import com.lin.dao.Dao;
import com.lin.dao.IndexDao;
import com.lin.dao.IndexDao2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author
 * @date 2019/5/20 - 15:00
 */
public class Test {
	/**
	 * 普通的注册是在扫描之后完成注册
	 * 解析configBean->扫描得到的所有@Conponent的bd->处理得到的所有@import(
	 * 1.importSelector 识别完后先configurationClasses.put();然后再注册
	 * 2.registrar 识别完后先importBeanDefinitionRegistrars.put();然后再注册
	 * 3.import普通类 识别完后先configurationClasses.put();然后判断之前是否注册
	 * )
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 1.创建工厂对象
		 * 2.创建默认加载器
		 */
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		/**
		 * 分析配置注解
		 */
		annotationConfigApplicationContext.register(Appconfig.class);
		/**
		 * 添加自定义后置处理器
		 */
		annotationConfigApplicationContext.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
		/**
		 * 分析具体注解,并实例化
		 */
		annotationConfigApplicationContext.refresh();
		IndexDao2 dao = annotationConfigApplicationContext.getBean(IndexDao2.class);
		//IndexDao dao1 = annotationConfigApplicationContext.getBean(IndexDao.class);
		System.out.println(dao.hashCode());
		//System.out.println(dao1.hashCode());
	}
}
