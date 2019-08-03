package com.hrbc.business.conf.aop;

import java.lang.annotation.*;

/**
 * 数据权限需要的注解
 */
@Target({ ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthAnno {
	/**
	 * 通过aff隔离的field
	 * @return
	 */
	String authfield() default "";

}

