package com.dhriti.task.controller;

import com.dhriti.task.entity.Student;
import com.dhriti.task.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping(value="", method= RequestMethod.GET)
    @CrossOrigin
    public ResponseEntity<List<Student>> Test(){
       List<Student> LList=studentService.getAllStudents();
        return  ResponseEntity.status(200).body(LList);
    }
}
