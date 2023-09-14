package com.woody_side.spring_boot_my_batis_example.mapper;

import com.woody_side.spring_boot_my_batis_example.model.Branch;
import com.woody_side.spring_boot_my_batis_example.model.Company;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CompanyMapper {

    @Select(value = "SELECT * FROM COMPANY WHERE company_id = #{company_id}")
    @Results(value = {
                      @Result(property = "id", column = "company_id"),
                      @Result(property = "name", column = "name"),
                      @Result(property = "dateOfCreation", column = "creation_date")})
    Company getCompanyById(@Param(value = "company_id") Integer companyId);

    @Select(value = "SELECT * FROM COMPANY")
    @Results(value = {
            @Result(property = "id", column = "company_id"),
            @Result(property = "name", column = "name"),
            @Result(property = "dateOfCreation", column = "creation_date"),
            @Result(property = "branches", javaType = List.class, column = "company_id",
                    many = @Many(select = "findAllBranchesByCompanyId"))})
    List<Company> findAll();

    @Delete(value = "DELETE FROM COMPANY WHERE company_id = #{company_id}")
    @Results(value = {
            @Result(property = "id", column = "company_id"),
            @Result(property = "name", column = "name"),
            @Result(property = "dateOfCreation", column = "creation_date")})
    void deleteByCompanyId(@Param(value = "company_id") Integer companyId);

    @Update(value = "UPDATE Company SET name = #{name} WHERE company_id = #{id}")
    void updateByCompanyId(Company company);

    @Insert("INSERT INTO COMPANY(company_id, name, creation_date) values (#{id}, #{name}, #{dateOfCreation})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "company_id")
    void createCompany(Company company);

    @Select(value = "SELECT * FROM Branch WHERE company_id = #{company_id}")
    @Results(value = {
            @Result(property = "id", column = "branch_id"),
            @Result(property = "branchFullName", column = "branch_full_name"),
            @Result(property = "branchAddress", column = "branch_address"),
            @Result(property = "companyId", column = "company_id"),

    })
    List<Branch> findAllBranchesByCompanyId(@Param(value = "company_id") Integer companyId);
}
