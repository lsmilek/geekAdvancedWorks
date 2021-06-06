package com.works.homework10;

import com.works.homework10.HikariDemo;
import com.works.homework8.Klass;
import com.works.homework8.School;
import com.works.homework8.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AutoConfiguration {
    @Bean
    public Student student123(){
        Student  student = new Student();
        student.setId(123);
        student.setName("KK123");
        return student;
    }
    @Bean
    public Student student100(){
        Student  student = new Student();
        student.setId(100);
        student.setName("KK100");
        return student;
    }
    @Bean
    public Klass class1(@Qualifier("student123") Student student123, @Qualifier("student100") Student student100){
        Klass class1 = new Klass();
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student123);
        studentList.add(student100);
        class1.setStudents(studentList);
        return class1;

    }
    @Bean
    public School school(){
        return new School();
    }
    @Bean
    public HikariDemo hikariDemo(){
        return  new HikariDemo();
    }

}
