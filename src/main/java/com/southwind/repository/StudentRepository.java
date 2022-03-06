package com.southwind.repository;

import com.southwind.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-05 21:57
 */
public interface StudentRepository {
    List<Student> findAll();
    Student findById(Long id);
    void save(Student student);
    void update(Student student);
    void deleteById(Long id);
}
