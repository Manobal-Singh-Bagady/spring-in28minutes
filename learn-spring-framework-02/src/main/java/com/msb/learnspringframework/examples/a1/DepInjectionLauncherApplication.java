package com.msb.learnspringframework.examples.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass {
    // Dependency Injection Type 1: Field Injection
//    @Autowired
    Dependency1 dependency1;
    //    @Autowired
    Dependency2 dependency2;


    // Dependency Injection Type 2: Field Injection
//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.println("Setter Injection - Dependency1");
//        this.dependency1 = dependency1;
//    }
//
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("Setter Injection - Dependency2");
//        this.dependency2 = dependency2;
//    }

    // Dependency Injection Type 3: Constructor Injection
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor Injection");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString() {
        return "YourBusinessClass{" + "dependency1=" + dependency1 + ", dependency2=" + dependency2 + '}';
    }
}

@Component
class Dependency1 {
}

@Component
class Dependency2 {
}

@ComponentScan
public class DepInjectionLauncherApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(YourBusinessClass.class));
    }

}
