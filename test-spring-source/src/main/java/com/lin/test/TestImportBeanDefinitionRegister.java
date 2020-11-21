package com.lin.test;

import com.lin.app.Appconfig;
import com.lin.service.CardService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/8 11:36
 */
public class TestImportBeanDefinitionRegister {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext(Appconfig.class);
		annotationConfigApplicationContext.getBean(CardService.class).query();
	}

}
