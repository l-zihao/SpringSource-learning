package com.lin.service;

import com.lin.dao.CardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/8 11:24
 */
@Service
public class CardService {

	@Autowired
	private CardDao cardDao;

	public void query(){
		System.out.println(cardDao.list("123"));
	}

}
