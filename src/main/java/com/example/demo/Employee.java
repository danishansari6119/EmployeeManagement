package com.example.demo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class Employee {
    int id;

    @NotBlank(message = "Name cannot be blank")
    String name;

    @Positive(message = "Salary cannot be negative")
    int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getSalary() {
        return salary;
    }
    
    
}
