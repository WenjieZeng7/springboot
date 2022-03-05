package com.southwind.repository;

import com.southwind.entity.Student;

import java.util.Collection;
import java.util.List;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-05 21:57
 */
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
