package com.woody_side.spring_boot_my_batis_example.service;

import com.woody_side.spring_boot_my_batis_example.mapper.CompanyMapper;
import com.woody_side.spring_boot_my_batis_example.model.Branch;
import com.woody_side.spring_boot_my_batis_example.model.Company;
import com.woody_side.spring_boot_my_batis_example.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService implements CompanyRepository {

    private final CompanyMapper companyMapper;

    @Override
    public List<Company> findAll() {
        return companyMapper.findAll();
    }

    @Override
    public Company getCompanyById(Integer id) {
        return companyMapper.getCompanyById(id);
    }

    @Override
    public void deleteByCompanyId(Integer id) {
        companyMapper.deleteByCompanyId(id);
    }

    @Override
    public Company updateByCompanyId(Company company) {
        companyMapper.updateByCompanyId(company);
        return getCompanyById(company.getId());
    }

    @Override
    public Company createCompany(Company company) {
        companyMapper.createCompany(company);
        return getCompanyById(company.getId());
    }

    @Override
    public List<Branch> findAllBranchesByCompanyId(Integer id) {
        return companyMapper.findAllBranchesByCompanyId(id);
    }
}
