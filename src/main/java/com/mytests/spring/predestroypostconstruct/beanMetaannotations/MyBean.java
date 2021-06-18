package com.mytests.spring.predestroypostconstruct.beanMetaannotations;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Bean(initMethod = "beanInit")
public @interface MyBean {
    @AliasFor(annotation = Bean.class, attribute = "destroyMethod")
    String destroy() default AbstractBeanDefinition.INFER_METHOD;
}