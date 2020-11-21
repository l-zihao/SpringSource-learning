package com.lin.anno;

import com.lin.importSelector.MyImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/8 16:53
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(MyImportSelector.class)
public @interface EnableImportSelector {
}
