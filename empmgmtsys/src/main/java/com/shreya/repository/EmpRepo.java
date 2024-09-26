package com.shreya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreya.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
