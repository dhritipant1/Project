package com.dhriti.task.service;

import com.dhriti.task.dao.StudentDao;
import com.dhriti.task.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;


    @Override
    public List<Student> getAllStudents() {
        List<Student> Slist= studentDao.findAll();
        return Slist;
    }
}
