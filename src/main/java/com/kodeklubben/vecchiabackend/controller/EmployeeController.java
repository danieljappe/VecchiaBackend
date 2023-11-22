package com.kodeklubben.vecchiabackend.controller;

import com.kodeklubben.vecchiabackend.model.Employee;
import com.kodeklubben.vecchiabackend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
public class EmployeeController {

  @Autowired
  EmployeeService employeeService;

  @GetMapping("/employees")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<ArrayList<Employee>> getAll(){
    ArrayList<Employee> employees = employeeService.getAll();
    return new ResponseEntity<>(employees, HttpStatus.OK);
  }
  @PostMapping(value ="/employees/create", consumes = "application/json")
  public ResponseEntity<Employee> create(@RequestBody Employee employee) {
    Employee createdEmployee = employeeService.create(employee);
    return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
  }

  @DeleteMapping("/employees/delete/{employeeID}")
  public ResponseEntity<Boolean> deleteById(@PathVariable("employeeID") Long id){
    boolean deleted = employeeService.deleteById(id);
    return new ResponseEntity<>(deleted, HttpStatus.NO_CONTENT);
  }

  @GetMapping("/employees/{itemID}")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<Employee> getById(@PathVariable("itemID") Long id){
    Employee employee = employeeService.getByID(id).get();
    return new ResponseEntity<>(employee, HttpStatus.OK);
  }

  @PostMapping(value ="/employees/update", consumes = "application/json")
  public ResponseEntity<Employee> update(@RequestBody Employee employee) {
    Employee updatedEmployee = employeeService.update(employee);
    return new ResponseEntity<>(updatedEmployee, HttpStatus.CREATED);
  }

}
