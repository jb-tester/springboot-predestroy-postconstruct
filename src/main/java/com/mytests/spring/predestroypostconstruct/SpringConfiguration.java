package com.mytests.spring.predestroypostconstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.PreDestroy;

@Configuration
public class SpringConfiguration {

    @PreDestroy
    public void destroy() {
        System.out.println("Shutdown initiated");
    }

    @Bean @Scope("singleton")
    public MySingletonBean mybean() {
        return new MySingletonBean();
    }

    @Bean @Scope("prototype")
    public MyPrototypeBean myprotobean() {
        return new MyPrototypeBean();
    }

    @Bean(initMethod = "initThisBean", destroyMethod = "destroyThisBean")
    public MyBeanWithExplicitInitDestroy myBeanWithExplicitInitDestroy() {
        return new MyBeanWithExplicitInitDestroy();
    }
}
