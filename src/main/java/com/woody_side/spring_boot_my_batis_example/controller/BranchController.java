package com.woody_side.spring_boot_my_batis_example.controller;

import com.woody_side.spring_boot_my_batis_example.model.Branch;
import com.woody_side.spring_boot_my_batis_example.service.BranchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/branches")
@RequiredArgsConstructor
public class BranchController {

    private final BranchService branchService;

    @GetMapping(path = "/{branchId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Branch>> findAllByCompanyId(@PathVariable(value = "branchId") Integer companyId) {
        return ResponseEntity.ok(branchService.findAllByCompanyId(companyId));
    }
}
