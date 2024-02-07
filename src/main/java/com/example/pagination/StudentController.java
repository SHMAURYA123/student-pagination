package com.example.pagination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "student added in Db successfully";
    }

    @GetMapping("/get")
    public List<Student> getAllStudent(@RequestParam(value="pageNumber",defaultValue = "0",required=false)Integer pageNumber
                                         , @RequestParam(value="pageSize",defaultValue = "5",required = false)Integer pageSize){
       List<Student> studentList=studentService.getAllstudent(pageNumber,pageSize);
      return studentList;
    }
}
