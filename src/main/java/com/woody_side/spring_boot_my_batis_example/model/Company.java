package com.woody_side.spring_boot_my_batis_example.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Company {

    private Integer id;
    private String name;
    private LocalDateTime dateOfCreation;
    private List<Branch> branches = new ArrayList<>();
}
