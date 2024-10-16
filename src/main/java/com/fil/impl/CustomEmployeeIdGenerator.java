package com.fil.impl;

import com.fil.model.Employee;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class CustomEmployeeIdGenerator implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        Employee employee = (Employee) object;
        String name = employee.getName();
        String dob = employee.getDob();
        return name+ dob;
    }
}
