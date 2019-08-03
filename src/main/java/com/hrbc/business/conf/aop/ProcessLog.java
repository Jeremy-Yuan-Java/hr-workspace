package com.hrbc.business.conf.aop;

import java.lang.annotation.*;

/**
  * TODO
  * @author huangyongchao
 */
@Target({ ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ProcessLog {
   
	String keyField() default "id"; 
	String businessName() default "";
	String methodName() default "";
}

