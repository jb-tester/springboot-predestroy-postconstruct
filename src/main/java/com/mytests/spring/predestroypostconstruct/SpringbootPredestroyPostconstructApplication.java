package com.mytests.spring.predestroypostconstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootPredestroyPostconstructApplication implements CommandLineRunner {
    @Autowired
    ApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPredestroyPostconstructApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        MySingletonBean mb1 = ctx.getBean(MySingletonBean.class);
        MyPrototypeBean mb2 = ctx.getBean(MyPrototypeBean.class);

    }
}
