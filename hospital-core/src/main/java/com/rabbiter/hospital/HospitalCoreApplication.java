package com.rabbiter.hospital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.rabbiter.hospital.mapper")
@SpringBootApplication
public class HospitalCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalCoreApplication.class, args);
    }

}
