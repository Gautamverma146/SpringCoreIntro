package com.Capgemini.springcoreintro.component;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String departmentName = "Engineering";
    public DepartmentBean(){}

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
