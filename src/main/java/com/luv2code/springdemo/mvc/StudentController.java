package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel){

        //creat object
        Student theStudent = new Student();

        // add to the model
        theModel.addAttribute("student" , theStudent);

        return "student-form";
    }

    @RequestMapping("showProcess")
    public String processForm(@ModelAttribute("student") Student theStudent){

        String firstN = theStudent.getFirstName();
        String lastN = theStudent.getLastName();
        System.out.printf(firstN+" "+lastN);
        return "student-Confirmation";

    }
}
