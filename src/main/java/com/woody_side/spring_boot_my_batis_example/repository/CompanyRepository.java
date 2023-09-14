package com.woody_side.spring_boot_my_batis_example.repository;

import com.woody_side.spring_boot_my_batis_example.model.Branch;
import com.woody_side.spring_boot_my_batis_example.model.Company;

import java.util.List;

public interface CompanyRepository {

   List<Company> findAll();

   Company getCompanyById(Integer id);

   void deleteByCompanyId(Integer id);

   Company updateByCompanyId(Company company);

   Company createCompany(Company company);

   List<Branch> findAllBranchesByCompanyId(Integer id);
}
