package com.msb.learnspringframework.examples.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class RealWorldSpringContextLauncherApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication.class);
        System.out.println(context.getBean(BusinessCalculationService.class).findMax());
    }
}
