package com.example.vecchiabackend.service;

import com.example.vecchiabackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

  @Autowired
  EmployeeRepository employeeRepository;

}
