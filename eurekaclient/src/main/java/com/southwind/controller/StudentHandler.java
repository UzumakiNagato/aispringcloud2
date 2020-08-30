package com.southwind.controller;

import com.southwind.entity.Student;
import com.southwind.repository.impl.StudentRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Autowired
    private StudentRepositoryImpl studentRepositoryImpl;
    //获取服务端口
    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentRepositoryImpl.finall();
    }
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id")Long id){
        return studentRepositoryImpl.finById(id);
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepositoryImpl.saveOrUpdate(student);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRepositoryImpl.saveOrUpdate(student);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id){
        studentRepositoryImpl.deleteById(id);
    }
    @GetMapping("/index")
    public String index(){
        return "当前端口:"+this.port;
    }
}
