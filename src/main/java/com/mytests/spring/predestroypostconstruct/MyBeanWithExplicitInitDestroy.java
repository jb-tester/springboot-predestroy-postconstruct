package com.mytests.spring.predestroypostconstruct;

/**
 * *
 * <p>Created by irina on 02.06.2021.</p>
 * <p>Project: springboot-predestroy-postconstruct</p>
 * *
 */
public class MyBeanWithExplicitInitDestroy {

    public void initThisBean(){
        System.out.println("myBeanWithExplicitInitDestroy initialized");
    }

    public void destroyThisBean(){
        System.out.println("myBeanWithExplicitInitDestroy destroyed");
    }
}
