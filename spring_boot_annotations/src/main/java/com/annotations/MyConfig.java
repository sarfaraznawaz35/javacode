package com.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.Date;

@Configuration
@ComponentScan(basePackages = {"mypack"})
public class MyConfig {

    @Bean("student1")
    @Lazy
    public Student getStudent(){
        System.out.println("Creating first Student object here..!!");
        return new Student("Student1");
    }

    @Bean("student2")
    @Lazy
    public Student createStudent(){
        System.out.println("Creating second student object");
        return new Student("student2");
    }

    @Bean
    public Date getDate(){
        System.out.println("Creating new date");
        return new Date();
    }

}
