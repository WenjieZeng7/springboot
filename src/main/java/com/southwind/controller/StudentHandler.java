package com.southwind.controller;

import com.southwind.entity.Student;
import com.southwind.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-05 22:17
 */
@RestController
public class StudentHandler {
    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/findAll")
    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")  //RequestMapping的派生注解，@PathVariable路径中的占位符
    public Student findById(@PathVariable("id") Long id){
        return studentRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepository.save(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRepository.update(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id){
        studentRepository.deleteById(id);
    }
}
