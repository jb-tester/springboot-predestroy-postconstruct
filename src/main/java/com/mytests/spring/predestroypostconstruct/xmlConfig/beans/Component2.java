package com.mytests.spring.predestroypostconstruct.xmlConfig.beans;

import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 6/18/2021.</p>
 * <p>Project: springboot-predestroy-postconstruct</p>
 * *
 */
@Component
public class Component2 {
    // https://youtrack.jetbrains.com/issue/IDEA-174563:
    // default init/destroy methods specified in <beans#default-init-method> / <beans#default-destroy-method>
    // are not recognized for the scanned components

    public void init_bean(){
        System.out.println("component2 initialized");
    }
    public void destroy_bean(){
        System.out.println("component2 destroyed");
    }
}
