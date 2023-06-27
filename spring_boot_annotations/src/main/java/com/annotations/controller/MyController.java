package com.annotations.controller;

import com.annotations.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @Autowired
    @Qualifier("student1")
    private Student student;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public Student home(@RequestBody Student st){
        st.studying();
        System.out.println("this is home method");
        this.student.setName("Durgesh Kumar Tiwari");
        return this.student;
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public String user(@PathVariable("userId") Integer uId ){
        return String.valueOf(uId);
    }

}
