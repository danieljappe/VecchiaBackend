package com.kodeklubben.vecchiabackend.controller;

import com.kodeklubben.vecchiabackend.dto.AuthorizedEmployee;
import com.kodeklubben.vecchiabackend.exceptions.*;
import com.kodeklubben.vecchiabackend.model.Employee;
import com.kodeklubben.vecchiabackend.service.EmployeeService;
import com.kodeklubben.vecchiabackend.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = {"http://127.0.0.1:5500", "https://vecchia-78929.web.app"})
public class EmployeeController {

  @Autowired
  EmployeeService employeeService;
  
  @Autowired
  TokenService tokenService;

  @GetMapping("/employees")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<ArrayList<Employee>> getAll(){
    ArrayList<Employee> employees = employeeService.getAll();
    if (employees == null) throw new GetException("An error occured while trying to get all employees. Make sure a token is provided.");
    return new ResponseEntity<>(employees, HttpStatus.OK);
  }
  
  @PostMapping(value ="/employees/create", consumes = "application/json")
  public ResponseEntity<Employee> create(@RequestBody Employee employee) {
    Employee createdEmployee = employeeService.create(employee);
    if (createdEmployee == null) throw new CreateException(employee, "Make sure a token is provided.");
    return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
  }

  @DeleteMapping("/employees/delete/{employeeID}")
  public ResponseEntity<Boolean> deleteById(@PathVariable("employeeID") Long id){
    boolean deleted = employeeService.deleteById(id);
    if (!deleted) throw new DeleteException(id, "Make sure the id is correct and necessary token is provided.");
    return new ResponseEntity<>(true, HttpStatus.NO_CONTENT);
  }

  @GetMapping("/employees/{itemID}")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<Employee> getById(@PathVariable("itemID") Long id){
    final Employee employee = employeeService.getByID(id)
            .orElseThrow(() -> new EmployeeNotFoundException(id));
    return new ResponseEntity<>(employee, HttpStatus.OK);
  }

  @PostMapping(value ="/employees/update", consumes = "application/json")
  public ResponseEntity<Employee> update(@RequestBody Employee employee) {
    final Employee updatedEmployee = employeeService.update(employee);
    if (updatedEmployee == null) throw new UpdateException(employee, "Given employee could not be updated.");
    return new ResponseEntity<>(updatedEmployee, HttpStatus.CREATED);
  }

  @PostMapping(value = "/employees/login", consumes = "application/json", produces = "application/json")
  public ResponseEntity<AuthorizedEmployee> login(@RequestBody Employee employee) {
    final Employee loggedInEmployee = employeeService.login(employee.getEmail(), employee.getPassword());
    if (loggedInEmployee != null) {
      //user is authorized and gets a token
      final AuthorizedEmployee authorizedEmployee = new AuthorizedEmployee(loggedInEmployee, tokenService.generateToken(employee.getEmail()));
      return new ResponseEntity<>(authorizedEmployee, HttpStatus.CREATED);
    } else {
      throw new EmployeeNotFoundException(employee);
    }
  }

  @PutMapping("/employees/update/{id}")
  public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") long id, @RequestBody Employee employeeDetails) {
    // Check if the Employee with the given id exists
    Employee employee = employeeService.getByID(id)
            .orElseThrow(() -> new EmployeeNotFoundException(employeeDetails));

    // Update the Employee details, excluding admin and id
    employee.setFirstName(employeeDetails.getFirstName());
    employee.setLastName(employeeDetails.getLastName());
    employee.setEmail(employeeDetails.getEmail());
    employee.setPhone(employeeDetails.getPhone());
    // Do not update 'employeeID' and 'isAdmin' fields

    // Save the updated Employee
    Employee updatedEmployee = employeeService.save(employee);
    if (updatedEmployee == null) throw new UpdateException(employee, "Given employee could not be saved.");
    return ResponseEntity.ok(updatedEmployee);
  }

}
