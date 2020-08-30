package com.southwind.repository;

import com.southwind.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface StudentRepository {

    public Collection<Student> finall();
    public Student finById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
