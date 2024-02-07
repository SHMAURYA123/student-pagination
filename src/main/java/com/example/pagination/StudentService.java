package com.example.pagination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllstudent(Integer pageNumber, Integer pageSize) {
        Pageable p= PageRequest.of(pageNumber,pageSize);
       Page<Student> studentPage=studentRepository.findAll(p);
       List<Student> studentList=studentPage.getContent();
       return studentList;
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }
}
