package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    // controller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    // controller method process the HTML form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processForm2")
    public String letsShout(HttpServletRequest request, Model model){
        String input = request.getParameter("studentName");
        String result = "YO! "+input;
        model.addAttribute("message", result);
        return "helloworld";
    }

    @RequestMapping("/showConfirm")
    public String showConfirmation(){
        return "student-Confirmation";
    }

}
