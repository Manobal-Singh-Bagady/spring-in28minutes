package com.msb.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1: Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        // 2: Configure the things we want Spring to manage. -
        // HelloWorldConfiguration - @Configuration
        // name() - @Bean

        // 3: Get the bean from the Spring Context
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person5Qualifier"));

//        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
