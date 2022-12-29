package com.linzrain.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.linzrain.reggie.entity.Employee;
import com.linzrain.reggie.mapper.EmployeeMapper;
import com.linzrain.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
