package org.example.service;

import org.example.model.Student;

import java.util.List;

public interface StudentService {
    public void addStudent(String name,int age,char grade);
    public void removeStudent(String name);
    public List<Student> displayStudent();
}
