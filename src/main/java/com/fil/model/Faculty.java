package com.fil.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "faculty")
public class Faculty extends Member{
    private Integer facid;
    private String designation;

    public Faculty() {
    }

    public Faculty(int memid,String name, String email, Integer facid, String designation) {
        super(memid,name, email);
        this.facid = facid;
        this.designation = designation;
        this.memid=memid;
    }

    public Integer getFacid() {
        return facid;
    }

    public void setFacid(Integer facid) {
        this.facid = facid;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facid=" + facid +
                ", designation='" + designation + '\'' +
                ", memid=" + memid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
