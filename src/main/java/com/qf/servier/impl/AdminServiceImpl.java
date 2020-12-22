package com.qf.servier.impl;


import com.qf.dao.AdminMapper;
import com.qf.pojo.Admin;
import com.qf.servier.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;


    @Override
    public List<Admin> find() {
        return adminMapper.selectByExample(null);
    }
}
