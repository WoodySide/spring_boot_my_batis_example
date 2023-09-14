package com.woody_side.spring_boot_my_batis_example.mapper;

import com.woody_side.spring_boot_my_batis_example.model.Branch;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BranchMapper {

    @Select(value = "SELECT * FROM Branch WHERE company_id = #{company_id}")
    @Results(value = {
            @Result(property = "id", column = "branch_id"),
            @Result(property = "branchFullName", column = "branch_full_name"),
            @Result(property = "branchAddress", column = "branch_address"),
            @Result(property = "companyId", column = "company_id")})
    List<Branch> findAllByCompanyId(@Param(value = "company_id") Integer companyId);
}
