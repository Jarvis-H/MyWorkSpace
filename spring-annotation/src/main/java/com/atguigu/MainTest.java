package com.atguigu;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        /**
         * xml方式
         */
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Person bean = (Person) applicationContext.getBean("person");
//        System.out.println(bean);


        /**
         * 注解方式
         */
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);

        String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String string : namesForType) {
            System.out.println(string);
        }
    }
}
