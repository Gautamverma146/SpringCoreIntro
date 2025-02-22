package com.Capgemini.springcoreintro.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
private String employeeName = "Jon Doe";
 private final DepartmentBean  department;
@Autowired
    public Employee(DepartmentBean department){
    this.department=department;
}
}
