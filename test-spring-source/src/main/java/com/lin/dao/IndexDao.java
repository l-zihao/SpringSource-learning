package com.lin.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/7 10:50
 */
@Repository
public class IndexDao implements Dao {

	//CommonAnnotationBeanPostProcessor -> setInitAnnotationType(PostConstruct.class);
/*	@PostConstruct*/
	public void init(){
		System.out.println("init");
	}

	public void query(){
		System.out.println("query");
	}

}
