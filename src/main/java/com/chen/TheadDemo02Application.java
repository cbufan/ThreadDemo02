package com.chen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@MapperScan(basePackages = {"com.chen.mapper"})
@EnableTransactionManagement
//@EnableAspectJAutoProxy
public class TheadDemo02Application {

    public static void main(String[] args) {
        SpringApplication.run(TheadDemo02Application.class, args);
    }

}
