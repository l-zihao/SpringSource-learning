package com.lin.test;

import com.lin.app.Appconfig;
import com.lin.dao.Dao;
import com.lin.dao.IndexDao2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/8 16:50
 */
public class TestImportAnno {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext(Appconfig.class);
		Dao dao = (Dao) annotationConfigApplicationContext.getBean("indexDao");
		dao.query();
	}

}
