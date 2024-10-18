package com.fil.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String deptid;
    private String location;

 public Department(String deptid, String location) {
        this.deptid = deptid;
        this.location = location;
    }

    public Department() {

    }

    public String getId() {
        return deptid;
    }
    public void setId(String id) {
        this.deptid = id;
    }
    public String getName() {
        return location;
    }
    public void setName(String name) {
        this.location = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + deptid +
                ", name='" + location + '\'' +
                '}';
    }
}
