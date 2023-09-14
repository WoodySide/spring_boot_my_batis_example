package com.woody_side.spring_boot_my_batis_example.service;

import com.woody_side.spring_boot_my_batis_example.mapper.BranchMapper;
import com.woody_side.spring_boot_my_batis_example.model.Branch;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BranchService {

    private final BranchMapper branchMapper;

    public List<Branch> findAllByCompanyId(Integer companyId) {
        return branchMapper.findAllByCompanyId(companyId);
    }
}
