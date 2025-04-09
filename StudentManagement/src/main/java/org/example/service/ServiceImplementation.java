package org.example.service;

import org.example.model.Student;
import org.example.repository.StudentRepo;

import java.util.ArrayList;
import java.util.List;

public class ServiceImplementation implements StudentService{


private StudentRepo repo=new StudentRepo();

    @Override
    public void addStudent(String name, int age, char grade) {
    repo.addStudent(name,age,grade);
    }

    @Override
    public void removeStudent(String name){
   repo.removeStudent(name);

    }

    @Override
    public List<Student> displayStudent() {


        return   repo.displayStudent();
    }
}
