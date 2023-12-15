package com.kodeklubben.vecchiabackend.exceptions;

import com.kodeklubben.vecchiabackend.model.Employee;

public class EmployeeNotFoundException extends RuntimeException{
  public EmployeeNotFoundException(Employee employee) {
    super("Provided employee details are probably incorrect: " + employee);
  }
  public EmployeeNotFoundException(Long id) {
    super("Provided id did not match with any employee in database: " + id);
  }
}
