package com.fil.impl;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import com.fil.dao.EntityManagerFactoryProvider;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.fil.dao.CourseDao;
import com.fil.model.Course;

import javax.persistence.EntityManager;

class CourseDaoImplTest {

	CourseDao course = new CourseDaoImpl();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFindById() {
		Course byId = course.findById(1);
		assertNotNull(byId);
	}

	@Test
	void testFindAllCourses() {
		List<Course> allCourses = course.findAllCourses();
		System.out.println(allCourses);
		for(Course course : allCourses) {
			System.out.println((Course)course);
		}
		assertEquals(7, allCourses.size());
	}

	@Test
	void testSave() {
//		EntityManager em = EntityManagerFactoryProvider.getEntityManagerFactory();
//		em.getTransaction().begin();
//		Course newCourse = new Course(0,"Hibernate",10000,50);
//		Course savedCourse = course.save(newCourse);
//		em.getTransaction().commit();
//		assertNotNull(savedCourse);
	}

}
