package com.msb.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
public class GamingAppLauncherApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);
        context.getBean(GameRunner.class).run();
    }
}
