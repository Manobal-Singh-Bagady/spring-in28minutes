package com.msb.learnspringframework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class A {
    public A() {
        System.out.println("A is created");
    }
}

@Component
@Lazy
class B {
    public B() {
        System.out.println("B is created");
    }
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        context.getBean(B.class);
    }

}
