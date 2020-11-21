package com.lin.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/8 12:18
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MySelect {
	public String value();
}
