package com.spring.jdbc;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Dao.StudentDao;
import com.spring.jdbc.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	
       ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    
   StudentDao studentdao=context.getBean("stu",StudentDao.class);
  //create object of student to set values
  Student s= new Student();
   s.setId(7);
   s.setName("indta");
   s.setCity("indralok");
   
  int result=studentdao.insert(s);
    
     
       System.out.println("student added "+result);
       
   Student s1= new Student();
   s1.setName("Kusuma");
   s1.setCity("Mysore");
   s1.setId(7);
   
   int result1=studentdao.change(s1);
   System.out.println("changed "+result1);
   
   Student s2= new Student();
   s.setId(2);
   int result11=studentdao.remove(s);
   System.out.println("deleted "+result11);
   
   
   
  Student stu =studentdao.getStudent(4);
   
   System.out.println(stu);
   
   
   List<Student> stu1=studentdao.getAllStudent();
   for(Student stud:stu1) {
	   System.out.println(stud);
   }
   
    }
    
    
   
    
   
}
