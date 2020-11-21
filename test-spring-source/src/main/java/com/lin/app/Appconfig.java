package com.lin.app;

import com.lin.anno.EnableImportSelector;
import com.lin.anno.MySacn;
import com.lin.service.CardService;
import com.lin.service.IndexService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan({"com.lin"})
@Configuration
/*@Import(MyImportBeanDefinitionRegister.class)*/
@MySacn
@EnableImportSelector
public class Appconfig {

	@Bean
	public IndexService indexService(){
		return new IndexService();
	}

	@Bean
	public CardService cardService(){
		indexService();
		return new CardService();
	}
}
