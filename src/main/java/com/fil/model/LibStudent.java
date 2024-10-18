package com.fil.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="student")
public class LibStudent extends Member {

    Integer rollNo;
    String branch;

    public LibStudent() {
    }

    public LibStudent(int memid,String name, String email, Integer rollNo, String branch) {
        super(memid,name, email);
        this.rollNo = rollNo;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "LibStudent{" +
                "rollNo=" + rollNo +
                ", branch='" + branch + '\'' +
                ", memid=" + memid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
