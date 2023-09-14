package com.woody_side.spring_boot_my_batis_example.dto;

import com.woody_side.spring_boot_my_batis_example.model.Branch;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Value
@Builder
public class CompanyDto {

    Integer id;
    String name;
    LocalDateTime dateOfCreation;
    List<Branch> branches = new ArrayList<>();
}
