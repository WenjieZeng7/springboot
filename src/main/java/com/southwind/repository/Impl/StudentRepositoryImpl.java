package com.southwind.repository.Impl;

import com.southwind.entity.Student;
import com.southwind.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-05 22:03
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository{
    private static Map<Long,Student> studentMap;
    static {
        //静态代码块（大括号内，随着类的加载只执行一次，用于一次性给静态变量赋值。static{}）
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",22));
        studentMap.put(2L,new Student(2L,"李四",23));
        studentMap.put(3L,new Student(3L,"王五",24));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values(); //Map中定义的方法，返回所有value构成的Collection集合
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
