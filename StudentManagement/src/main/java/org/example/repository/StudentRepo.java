package org.example.repository;

import org.example.exception.InvalidDataException;
import org.example.model.Student;
import org.example.service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo  implements StudentService {
   private static final ArrayList<Student> students;
    static {
          students   = new ArrayList<>();

    }
//public void addStudent(Student st){
//
//    students.add(st);
//}

    @Override
    public void addStudent(String name, int age, char grade) {
        if(students.stream().anyMatch(x->x.getName().equalsIgnoreCase(name))){
            throw new InvalidDataException("Same name data already present.....! please try adding new data");

        }
        students.add(new Student(name,age,grade));
    }

    public void removeStudent(String name){
    for(int i=0;i<students.size();i++){
        if(students.get(i).getName().equalsIgnoreCase(name)){
            students.remove(i);
            System.out.println("Student "+name+" removed Sucessfully");
            return;
        }else{
            throw new InvalidDataException("Data not present! first add then remove");
        }

    }
    System.out.println("Student "+name +" not found");
}


public List<Student> displayStudent(){
    return students;
}
}
