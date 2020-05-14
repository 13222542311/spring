package com.xj.springbootnew;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xj.springbootnew.mapper")
public class SpringbootNewApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootNewApplication.class, args);
    }

}
