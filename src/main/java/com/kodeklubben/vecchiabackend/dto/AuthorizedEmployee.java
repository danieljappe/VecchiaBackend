package com.kodeklubben.vecchiabackend.dto;

import com.kodeklubben.vecchiabackend.model.Employee;
import jakarta.persistence.*;
import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Employees")
public class AuthorizedEmployee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  private long employeeID;

  @Column(name = "Password")
  private String password;

  @Column(name = "FirstName")
  private String firstName;

  @Column(name = "LastName")
  private String lastName;

  @Column(name = "Email")
  private String email;

  @Column(name = "Phone")
  private String phone;

  @Column(name = "IsAdmin")
  private boolean isAdmin;

  private String token;

  public AuthorizedEmployee(Employee employee, String token) {
    this.employeeID = employee.getEmployeeID();
    this.password = employee.getPassword();
    this.firstName = employee.getFirstName();
    this.lastName = employee.getLastName();
    this.email = employee.getEmail();
    this.phone = employee.getPhone();
    this.isAdmin = employee.isAdmin();
    this.token = token;
  }
}
