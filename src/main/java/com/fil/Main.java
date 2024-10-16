package com.fil;
import com.fil.dao.EmployeeDao;
import com.fil.impl.EmployeeDaoImpl;
import com.fil.model.Employee;

public class Main {
    public static void main(String[] args) {

        System.out.println("Project is running...");

//        EmployeeDao employeeDao = new EmployeeDaoImpl();
//        Employee employee = new Employee();
//        employee.setAadhar("2024");
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