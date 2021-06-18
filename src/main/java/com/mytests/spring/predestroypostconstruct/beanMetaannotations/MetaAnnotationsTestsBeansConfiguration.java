package com.mytests.spring.predestroypostconstruct.beanMetaannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MetaAnnotationsTestsBeansConfiguration {
    // https://youtrack.jetbrains.com/issue/IDEA-174570
    // 1) no error is shown if no method with specified name exists in Bean5
    // 2) no intention to create method is available
    @MyBean(destroy = "deleteBean1")
    public Bean1 bean1(){
        return new Bean1();
    }
}
