package com.example.studentapi;
import java.util.HashMap;
import java.util.Map;

public class InMemoryStudentRepository implements StudentRepository {

    Map<String ,Student> database=new HashMap<>();

    //
    @Override
    public void save(Student student) {
        //todo: save this student in the database.
        database.put(student.id,student);
        System.out.println("Student Saved");
    }

    public Student get(String id){
        return database.get(id);
    }

    public void delete(String id){
        database.remove(id);
        System.out.println("Student Deleted");
    }

    public  void update(Student student){
        database.put(student.id, student);
        System.out.println("Student Updated");
    }
}
