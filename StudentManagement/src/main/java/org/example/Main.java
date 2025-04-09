package org.example;

import org.example.model.Student;
import org.example.service.ServiceImplementation;
import org.example.service.StudentService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServiceImplementation s1=new ServiceImplementation();
        ServiceImplementation s2=new ServiceImplementation();
        ServiceImplementation s3=new ServiceImplementation();
        s1.addStudent("Harsh",23,'A');
        s2.addStudent("Ashu",26,'B');
        s3.addStudent("Ravi",24,'A');
//s1.addStudent("Ashu",24,'A');

        System.out.println(s1.displayStudent());
        s1.removeStudent("nitin");
//        System.out.println(s1.displayStudent());
    }
}