package com.mytests.spring.predestroypostconstruct.xmlConfig.beans;

/**
 * *
 * <p>Created by irina on 6/18/2021.</p>
 * <p>Project: springboot-predestroy-postconstruct</p>
 * *
 */
public class Bean2 {
    public void init_bean(){
        System.out.println("bean2 initialized");
    }
    public void destroy_bean(){
        System.out.println("bean2 destroyed");
    }
}
