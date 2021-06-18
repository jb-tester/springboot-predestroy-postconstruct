package com.mytests.spring.predestroypostconstruct;

import com.mytests.spring.predestroypostconstruct.standardAnnotationsAndMethodsWithDefaultNames.MyBeanWithExplicitInitDestroy;
import com.mytests.spring.predestroypostconstruct.standardAnnotationsAndMethodsWithDefaultNames.MyPrototypeBean;
import com.mytests.spring.predestroypostconstruct.standardAnnotationsAndMethodsWithDefaultNames.MySingletonBean;
import com.mytests.spring.predestroypostconstruct.xmlConfig.beans.Bean3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = {
        "com.mytests.spring.predestroypostconstruct.beanMetaannotations",
        "com.mytests.spring.predestroypostconstruct.standardAnnotationsAndMethodsWithDefaultNames",
        "com.mytests.spring.predestroypostconstruct.xmlConfig.configs"
})
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
        MyBeanWithExplicitInitDestroy mb3 = ctx.getBean(MyBeanWithExplicitInitDestroy.class);
        Bean3 b3 = ctx.getBean(Bean3.class);
    }
}
