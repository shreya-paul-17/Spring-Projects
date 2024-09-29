package com.shreya.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.shreya.entity.Employee;
import com.shreya.service.EmpService;

//import org.springframework.web.bind.annotation.RequestBody;
//import jakarta.servlet.http.HttpSession;

@Controller
public class EmpController {

    @Autowired
    private EmpService service;

    @GetMapping("/")
    public String home(Model m)
    {
        List<Employee> emp=service.getAllEmp();
        m.addAttribute("emp", emp);
        return "index";
    }

    @GetMapping("/addemp")
    public String addEmpForm()
    {
        return "add_emp";
    }

    @PostMapping("/register")
    // public String empRegister(@ModelAttribute Employee e,HttpSession session)
    public String empRegister(@ModelAttribute Employee e, RedirectAttributes redirectAttributes){
        System.out.println(e);
        
        service.addEmp(e);
        // session.setAttribute("msg", "Employee added successfully...");
        redirectAttributes.addFlashAttribute("msg", "Employee added successfully...");
        return "redirect:/";
    } 

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model m)
    {
        Employee e =service.getEmpById(id);
        m.addAttribute("emp", e);
        return "edit";
    }

    // @PostMapping("/update")
    // public String updateEmp(@ModelAttribute Employee e, HttpSession session)
    // {
    //     service.addEmp(e);
    //     session.setAttribute("msg", "Employee Data updated successfully...");
    //     return "redirect:/";
    // }

    @PostMapping("/update")
    public String updateEmp(@ModelAttribute Employee e, RedirectAttributes redirectAttributes)
    {
        //System.out.println(e);
        service.addEmp(e);
        redirectAttributes.addFlashAttribute("msg", "Employee Data updated successfully...");
        return "redirect:/";
    } 

    @GetMapping("/delete/{id}")
    public String deleteEmp(@PathVariable int id, RedirectAttributes redirectAttributes)
    {
        service.deleteEmp(id);
        redirectAttributes.addFlashAttribute("msg", "Employee Data deleted successfully...");
        return "redirect:/";
    }

}

