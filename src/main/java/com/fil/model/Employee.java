package com.fil.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Employee {
    @Id
    @GeneratedValue(generator = "empcustomsid")
    @GenericGenerator(name = "empcustomsid",strategy = "com.fil.impl.CustomEmployeeIdGenerator")
    private String empid;
    private String name;
    private String dob;
    private String aadhar;
    private Integer salary;
    private String gender;

    @ManyToMany(cascade = CascadeType.ALL)
////            @JoinTable(name="project_employee", joinColumns = @JoinCol)
    @JoinTable(
            name="project_employee",
            joinColumns=
            @JoinColumn(name="employeesWorkingOnThisProject_empid"),
            inverseJoinColumns=
            @JoinColumn(name="Project_id")
    )
    List<Project> projectList = new ArrayList<Project>();

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

//    @ManyToOne
//    @JoinColumn(name = "deptid")
//    private Course course;

    public Employee(){}


    public Employee(String empid, String name, String dob, String aadhar, Integer salary, String gender) {
        this.empid = empid;
        this.name = name;
        this.dob = dob;
        this.aadhar = aadhar;
        this.salary = salary;
        this.gender = gender;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String deptid) {
        this.aadhar = deptid;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "EmployeeDao{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", deptid='" + aadhar + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
}
