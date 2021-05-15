package com.example.studentapi;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class StudentController {

    StudentRepository repository=new InMemoryStudentRepository();
    //REST ENDPOINTS
    //Create a student
    @PostMapping("/student")
    public void createStudent(@RequestBody Student student){
        repository.save(student);
    }

    //retrieve a student
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id){
        return repository.get(id);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable String id){
        repository.delete(id);
    }

    @PutMapping("/student")
    public void updateStudent(@RequestBody Student student){
        repository.update(student);
    }
}
