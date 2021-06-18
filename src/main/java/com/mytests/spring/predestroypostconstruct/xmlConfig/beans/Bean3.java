package com.mytests.spring.predestroypostconstruct.xmlConfig.beans;

/**
 * *
 * <p>Created by irina on 6/18/2021.</p>
 * <p>Project: springboot-predestroy-postconstruct</p>
 * *
 */
public class Bean3 {
    private void personal_init() {
        System.out.println("bean3 initialized - personal method");
    }
    // should not be shown as used since the explicit init method for this bean is specified
    public void init_bean(){
        System.out.println("bean3 initialized - default method");
    }
    public void destroy_bean(){
        System.out.println("bean3 destroyed");
    }
}
