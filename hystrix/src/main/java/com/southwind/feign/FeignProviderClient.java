package com.southwind.feign;

import com.southwind.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
@FeignClient(value = "provider") //当前要访问的哪个微服务,如果出现问题就会访问FeignError
public interface FeignProviderClient {
    @GetMapping("/student/findAll") //provider的地址
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
