package com.lin.dao;

import com.lin.anno.MySelect;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/8 11:23
		*/
public interface CardDao {

	@MySelect("select * from card where card_id = '${cardId}'")
	public String list(String cardId);

}
