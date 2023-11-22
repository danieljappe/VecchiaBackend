package com.kodeklubben.vecchiabackend.service;

import com.kodeklubben.vecchiabackend.model.Employee;
import com.kodeklubben.vecchiabackend.model.MenuItem;
import com.kodeklubben.vecchiabackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmployeeService {

  @Autowired
  EmployeeRepository employeeRepository;

    public Employee login(String email, String password) {
        return employeeRepository.findByEmailAndPassword(email, password);
    }

  public ArrayList<Employee> getAll(){
    return (ArrayList<Employee>) employeeRepository.findAll();
  }

  public Optional<Employee> getByID(long id){
    return employeeRepository.findById(id);
  }

  public Employee create(Employee employee){
    employeeRepository.save(employee);
    return employee;
  }

  public boolean deleteById(long id) {
    try {
      employeeRepository.deleteById(id);
      return true;
    } catch (Exception exception) {
      return false;
    }
  }

  public Employee update(Employee employee) {
    employeeRepository.save(employee);
    return employee;
  }

}
