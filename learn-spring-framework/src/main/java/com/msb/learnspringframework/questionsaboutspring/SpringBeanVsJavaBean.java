package com.msb.learnspringframework.questionsaboutspring;

import java.io.Serializable;

// any java object is called POJO (Plain Old Java Object)
class Pojo {
    private String text;
    private int number;

    public String toString() {
        return text + ":" + number;
    }
}

// EJB (Enterprise Java Bean) - JavaBean
class JavaBean implements Serializable {
    // public no-arg constructor
    public JavaBean() {
    }

    // private fields
    private String text;
    private int number;

    // public getter and setter methods
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return text + ":" + number;
    }
}

// Spring Bean - any java object that is managed by Spring IoC container

public class SpringBeanVsJavaBean {
    public static void main(String[] args) {
        Pojo pojo = new Pojo();
        System.out.println(pojo);

        JavaBean javaBean = new JavaBean();
        javaBean.setText("Hello");
        javaBean.setNumber(10);
        System.out.println(javaBean);
    }
}
