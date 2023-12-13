package com.kodeklubben.vecchiabackend.dto;

import com.kodeklubben.vecchiabackend.model.Employee;

public class User {
  private Employee employee;
  private String token;

  public User(Employee employee, String token) {
    this.employee = employee;
    this.token = token;
  }
}
