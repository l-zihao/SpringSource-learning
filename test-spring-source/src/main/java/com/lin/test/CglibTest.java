package com.lin.test;

import com.lin.app.Appconfig;
import com.lin.dao.IndexDao;
import com.lin.methodCallback.TestMethodCallback;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/9 17:12
 */
public class CglibTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext(Appconfig.class);

		Enhancer enhancer = new Enhancer();

		//增强父类，cglib基于继承
		enhancer.setSuperclass(IndexDao.class);

		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);

		enhancer.setCallback(new TestMethodCallback());

		IndexDao dao = (IndexDao) enhancer.create();

		dao.query();

	}

}
