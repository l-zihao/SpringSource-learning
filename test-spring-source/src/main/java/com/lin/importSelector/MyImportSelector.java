package com.lin.importSelector;

import com.lin.beanPostProcessor.AopBeanPostProcessor;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/8 16:48
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{AopBeanPostProcessor.class.getName()};
	}
}
