package com.fil.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String client;
    private Date startDate,endDate;

    @ManyToMany(cascade = CascadeType.ALL)
    List<Employee> employeesWorkingOnThisProject = new ArrayList<>();

    public List<Employee> getEmployeesWorkingOnThisProject() {
        return employeesWorkingOnThisProject;
    }

    public void setEmployeesWorkingOnThisProject(List<Employee> employeesWorkingOnThisProject) {
        this.employeesWorkingOnThisProject = employeesWorkingOnThisProject;
    }

    public Project(int id, String title, String client, Date startDate, Date endDate) {
        this.id = id;
        this.title = title;
        this.client = client;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Project() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", client='" + client + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
