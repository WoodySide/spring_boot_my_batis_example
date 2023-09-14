package com.woody_side.spring_boot_my_batis_example.model;

import lombok.Data;

@Data
public class Branch {

    private Integer id;
    private String branchFullName;
    private String branchAddress;
    private Integer companyId;
}
