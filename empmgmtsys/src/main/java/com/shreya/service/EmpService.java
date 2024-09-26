package com.shreya.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.shreya.entity.Employee;
import com.shreya.repository.EmpRepo;

public class EmpService {

    @Autowired
    private EmpRepo repo;

    public void addEmp(Employee e)
    {
        repo.save(e);
    }
}
