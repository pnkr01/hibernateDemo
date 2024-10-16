package com.fil.impl;
import com.fil.dao.CourseDao;
import com.fil.dao.EntityManagerFactoryProvider;
import com.fil.model.Course;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseDaoImpl implements CourseDao {
    EntityManager entityManager = EntityManagerFactoryProvider.getEntityManagerFactory();
    @Override
    public Course findById(int id) {
        return entityManager.find(Course.class, id);
    }

    @Override
    public List<Course> findAllCourses() {
        List resultList = entityManager.createNativeQuery("SELECT  * FROM Course", Course.class).getResultList();
        return resultList;
//        return entityManager.createQuery("from Course", Course.class).getResultList();
    }

    @Override
    public Course save(Course course) {
        entityManager.persist(course);
        return course;
    }
}
