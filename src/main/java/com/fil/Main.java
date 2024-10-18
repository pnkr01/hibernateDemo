package com.fil;
import com.fil.dao.EmployeeDao;
import com.fil.dao.EntityManagerFactoryProvider;
import com.fil.dao.PackageDao;
import com.fil.impl.EmployeeDaoImpl;
import com.fil.impl.PackageDaoImpl;
import com.fil.model.*;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class Main {
//    public static Logger
    public static void main(String[] args) {
        EntityManager em = EntityManagerFactoryProvider.getEntityManagerFactory();

        em.getTransaction().begin();

        Person p1 = new Person(0,"Pawan");
        em.persist(p1);
        Consumer c = new Consumer(0,"Rahul","JSR",1.005);
        em.persist(c);
        EmployeeInh employeeInh = new EmployeeInh(0,"Ashutosh",125,"SDE");
        em.persist(employeeInh);

        Query query = em.createQuery("select p from Person p", Person.class);
        List<Person> persons = query.getResultList();
        persons.forEach(System.out::println);




//        Faculty faculty = new Faculty(1001,"Pawan","pawan@gmail.com",11,"CE dept");
//        Student student = new Student(1,"Pawan Singh","EE","p@gmail.com","6262626262", Date.valueOf("2024-01-03").toLocalDate(),300);
//        em.merge(faculty);
//        em.merge(student);
//        Query selectSFromFacultyS = em.createQuery("SELECT f FROM Faculty f");
//        List resultList = selectSFromFacultyS.getResultList();
//        resultList.forEach(System.out::println);
        em.getTransaction().commit();
//
//        Project project = em.find(Project.class, 1);
//        List<Employee> employeesWorkingOnThisProject = project.getEmployeesWorkingOnThisProject();
//        Employee employee = new Employee("Pkkkk","oooo","2024-01-02","252525",415244,"M");
//        employeesWorkingOnThisProject.add(employee);
//        project.setEmployeesWorkingOnThisProject(employeesWorkingOnThisProject);
//        em.merge(project);
//        em.getTransaction().commit();



//        Employee employee = em.find(Employee.class, "Pawan5c11da12");
//        Employee employee1 = em.find(Employee.class, " Rahul Singh2024-01-02");
//        employeesWorkingOnThisProject.add(employee);
//        employeesWorkingOnThisProject.add(employee1);
//        em.persist(project);
//        System.out.println(employeesWorkingOnThisProject);
//        System.out.println(project);

//        Employee employee = em.find(Employee.class, "Pawan5c11da12");
//        List<Project> projectList = employee.getProjectList();
//        Project project = em.find(Project.class, 1);
//        projectList.add(project);
//        employee.setProjectList(projectList);
//        em.persist(employee);


//        System.out.println("Project is running...");
//        List<Package> pkgdao =  new PackageDaoImpl().getPackage("New Delhi","Paris");
//        System.out.println(pkgdao);

//
//        EmployeeDao employeeDao = new EmployeeDaoImpl();
//        Employee employee = new Employee();
//        employee.setDob("2024-01-02");
//        employee.setGender("M");
//        employee.setName("Rahul Singh");
//        employee.setSalary(5000);
//        Employee savedEmployee = employeeDao.save(employee);
//        System.out.println(savedEmployee);
//
//
//        em.getTransaction().begin();
//        Parking parking = new Parking(0,1,1,1);
//
//        parking.setEmployee(employee);
//        em.persist(parking);
//        em.getTransaction().commit();

//        Department hr = new Department("HR","Floor1");
//        Department acc = new Department("ACC","Floor1");
//        em.getTransaction().begin();
//        em.persist(hr);
//        em.persist(acc);
//        em.getTransaction().commit();
//        em.close();

//        EmployeeDao employeeDao = new EmployeeDaoImpl();
//        Employee employee = new Employee();
//        employee.setDeptid("2024");
//        employee.setDob("2024-01-02");
//        employee.setGender("M");
//        employee.setName("Rahul Singh");
//        employee.setSalary(5000);
//        Employee savedEmployee = employeeDao.save(employee);
//        System.out.println(savedEmployee);
    }
//        EntityManagerFactory emf=null;
//        try{
//            emf = Persistence.createEntityManagerFactory("fil");
//            EntityManager em = emf.createEntityManager();
//
//            //getting data from DB
//            Student student = findStudentById(em,101);
//            List<Student> getAllStudents = getStudentList(em);
//            displayAllStudent(getAllStudents);
//
//
//            //inserting data to DB
////            insertTheDataToDb(em,"Rahul Rahuls",108,"ECE","+91 6299232123","rahul@gmail.com");
////            em.close();
//
//
//            insertThisProject(em);
//
////            Project project = em.find(Project.class, 12);
////            System.out.println(project);
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            emf.close();
//        }
//    }








//
//    private static void insertThisProject(EntityManager em) {
//        Project p1 = new Project(0,"Flipkart Coupons","Flipkart", Date.valueOf("2024-01-02"),Date.valueOf("2024-01-03"));
//        em.getTransaction().begin();
//        em.persist(p1);
//        em.getTransaction().commit();
//        em.close();
//    }
//
//    private static void insertTheDataToDb(EntityManager em,String name,int sid,String branch, String phone,String email) {
//        System.out.println("Starting Transaction");
//        em.getTransaction().begin();
//        Student newStudent = new Student();
//        newStudent.setName(name);
//        newStudent.setSid(sid);
//        newStudent.setBranch(branch);
//        newStudent.setPhone(phone);
//        newStudent.setEmail(email);
//        em.persist(newStudent);
//        em.getTransaction().commit();
//
//        System.out.println("inserted data is is"+newStudent);
//
//        System.out.println("finished Transaction");
//        em.close();
//    }
//
//    private static void displayAllStudent(List<Student> getAllStudents) {
//        for(Student s : getAllStudents){
//            System.out.println(s);
//        }
//    }
//
//    private static List<Student> getStudentList(EntityManager em) {
//        return em.createQuery("from Student", Student.class).getResultList();
//    }
//
//    private static Student findStudentById(EntityManager em,int sid) {
//        Student student = em.find(Student.class, sid);
//        System.out.println(student);
//        return student;
//    }
}