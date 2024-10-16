package com.fil.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

    public Employee(){}


    Employee(String empid, String name, String dob, String aadhar, Integer salary, String gender) {
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

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
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
                ", aadhar='" + aadhar + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
}
