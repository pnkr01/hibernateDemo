package com.fil.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //for auto increment..
    private int cid;
    private String cName;
    private Integer duration;
    private Integer cost;

    public Course(int cid, String cName, int duration, int cost) {
        this.cid = cid;
        this.cName = cName;
        this.duration = duration;
        this.cost = cost;
    }

    public Course() {}

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", cName='" + cName + '\'' +
                ", duration=" + duration +
                ", cost=" + cost +
                '}';
    }
}
