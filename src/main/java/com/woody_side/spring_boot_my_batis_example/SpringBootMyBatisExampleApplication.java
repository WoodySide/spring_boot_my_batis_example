package com.woody_side.spring_boot_my_batis_example;

import com.woody_side.spring_boot_my_batis_example.model.Company;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(value = Company.class)
@MapperScan(value = "com.woody_side.spring_boot_my_batis_example.mapper")
@SpringBootApplication
public class SpringBootMyBatisExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMyBatisExampleApplication.class, args);
    }

}
