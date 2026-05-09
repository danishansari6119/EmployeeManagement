package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class EmployeeController {

    List<Employee> employees = new ArrayList<>();

    @PostMapping("/addEmployee")
    public String addemployee(@RequestBody Employee employee) {
        employees.add(employee);

        return "Employee added successfully";
    }
    
    @GetMapping("/getAllemployee")
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @GetMapping("/{id}")
    public Employee getEmpbyId(@PathVariable int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;

            }
        }
        return null;
    }

    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.setName(updatedEmployee.getName());
                emp.setSalary(updatedEmployee.getSalary());
                return "Employee updated successfully";
            }
        }
        return "Employee not found";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id){
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                employees.remove(emp);
                return "Employee Deleted ";
            }

        }
        return "not found";
        }
    }

    
    

  


    
        

