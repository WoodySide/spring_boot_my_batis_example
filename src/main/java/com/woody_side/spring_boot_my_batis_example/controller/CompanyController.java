package com.woody_side.spring_boot_my_batis_example.controller;

import com.woody_side.spring_boot_my_batis_example.model.Branch;
import com.woody_side.spring_boot_my_batis_example.model.Company;
import com.woody_side.spring_boot_my_batis_example.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/companies")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Company>> findAll() {
        return ResponseEntity.ok(companyService.findAll());
    }

    @GetMapping(path = "/{company_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Company> findByCompanyId(@PathVariable(value = "company_id") Integer id) {
        return ResponseEntity.ok(companyService.getCompanyById(id));
    }

    @GetMapping(path = "/branches/{company_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Branch>> findAllBranchesByCompanyId(@PathVariable(value = "company_id") Integer id) {
        return ResponseEntity.ok(companyService.findAllBranchesByCompanyId(id));
    }

    @DeleteMapping(path = "/{company_id}")
    public ResponseEntity<Void> deleteByCompanyId(@PathVariable(value = "company_id") Integer id) {
        companyService.deleteByCompanyId(id);

        return ResponseEntity.noContent().build();
    }

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Company> createCompany(@RequestBody Company company) {
        return ResponseEntity.ok(companyService.createCompany(company));
    }

    @PutMapping(value = "/{company_id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Company> updateCompanyByCompanyId(@RequestBody Company company) {
        return ResponseEntity.ok(companyService.updateByCompanyId(company));
    }
}
