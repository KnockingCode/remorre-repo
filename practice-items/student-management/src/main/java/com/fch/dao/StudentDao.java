package com.fch.dao;

import com.fch.domain.Student;

import java.util.List;

/**
 * @packageName com.fch.dao
 * @ClassName StudentDao
 * @Description TODO
 * @Author Fan-CUNH
 * @Date 2023/7/4 19:06
 * @Version 1.0
 */
public interface StudentDao {
    boolean insert(Student student);

    boolean delete(Integer stuId);

    boolean update(Student student);

    Student findById(Integer stuId);

    List<Student> findAll();
}
