package com.qf.servier;

import com.qf.pojo.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    List<Admin> find();
}
