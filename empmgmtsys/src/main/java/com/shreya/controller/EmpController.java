package com.shreya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.shreya.entity.Employee;
import com.shreya.service.EmpService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmpController {

    @Autowired
    private EmpService service;

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
    public String empRegister(@ModelAttribute Employee e,HttpSession session){
        System.out.println(e);
        
        service.addEmp(e);
        session.setAttribute("msg", "Employee added successfully...");
        return "redirect:/";
    } 
}

