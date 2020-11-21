package com.lin.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/7 10:50
 */
@Repository
public class IndexDao2 implements Dao {

	public void query(){
		System.out.println("query");
	}
}
