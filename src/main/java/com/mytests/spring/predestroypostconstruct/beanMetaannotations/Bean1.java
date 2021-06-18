package com.mytests.spring.predestroypostconstruct.beanMetaannotations;


public class Bean1 {
     // default init method is shown as unused - https://youtrack.jetbrains.com/issue/IDEA-174569
    public void beanInit(){
        System.out.println("bean1 was initialized");
    }
    // no gutter icon - https://youtrack.jetbrains.com/issue/IDEA-174570
    public void deleteBean1(){
        System.out.println("bean1 was destroyed");
    }
}
