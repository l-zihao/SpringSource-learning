package com.lin.anno;

import com.lin.importBeanDefinitionRegister.MyImportBeanDefinitionRegister;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/8 11:57
 */
@Import(MyImportBeanDefinitionRegister.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface MySacn {
}
