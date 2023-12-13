package com.kodeklubben.vecchiabackend.controller;

import com.kodeklubben.vecchiabackend.service.TokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@CrossOrigin(origins = {"http://127.0.0.1:5500", "https://vecchia-78929.web.app"})
@RestController
public class AuthController {

  private static final Logger LOG = LoggerFactory.getLogger(AuthController.class);

  private final TokenService tokenService;

  public AuthController(TokenService tokenService) {
    this.tokenService = tokenService;
  }

  @PostMapping("/token")
  public String token(@RequestBody Map<String, String> credentials) {
    final String username = credentials.get("username");
    final String password = credentials.get("password");
    LOG.debug("Token requested for user: '{}'", username);
    String token = tokenService.generateToken(username);
    LOG.debug("Token granted {}", token);
    return token;
  }
}
