package com.shreya.entity;

// import lombok.Data;
// import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
// @Data
@Table(name = "EMP_SYSTEM")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "ID")
    private int id; 

    // @Column(name = "NAME")
    private String name;

    // @Column(name = "ADDRESS")
    private String address;

    // @Column(name = "EMAIL")
    private String email;

    // @Column(name = "PHNO.")
    private String phno;  

    // @Column(name = "SALARY")
    private int salary;

    public Employee() {
        super();
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    // Fix the method name to match the variable name
    public String getPhno() {
        return phno;
    }
    
    public void setPhno(String phno) {
        this.phno = phno;
    }

    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", address=" + address + 
               ", email=" + email + ", phno=" + phno + ", salary=" + salary + "]";
    }
}
