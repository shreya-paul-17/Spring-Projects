package com.shreya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.shreya.entity.Employee;

@Controller
public class EmpController {

    @GetMapping("/")
    public String home()
    {
        return "index";
    }

    @GetMapping("/addemp")
    public String addEmpForm()
    {
        return "add_emp";
    }

    @PostMapping("/register")
    public String empRegister(@ModelAttribute Employee e){
        System.out.println(e);
        return "add_emp";
    }
}
