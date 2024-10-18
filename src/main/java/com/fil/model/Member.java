package com.fil.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public class Member {
    @Id
    @GeneratedValue
    int memid;
    String name;
    String email;

    public Member(){}
    public Member(int memid,String name, String email) {
        this.name = name;
        this.email = email;
        this.memid = memid;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memid=" + memid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
