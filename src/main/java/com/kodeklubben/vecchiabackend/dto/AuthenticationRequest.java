package com.kodeklubben.vecchiabackend.dto;

import org.springframework.security.core.Authentication;

public class AuthenticationRequest {
  private final String email;
  private final String password;

  public AuthenticationRequest(String email, String password) {
    this.email = email;
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

}
