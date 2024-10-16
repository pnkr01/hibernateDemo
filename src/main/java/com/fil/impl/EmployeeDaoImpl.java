package com.fil.impl;

import com.fil.dao.EmployeeDao;
import com.fil.dao.EntityManagerFactoryProvider;
import com.fil.model.Employee;

import javax.persistence.EntityManager;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public Employee save(Employee employee) {
        EntityManager entityManager = EntityManagerFactoryProvider.getEntityManagerFactory();
        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
        return employee;
    }
}
