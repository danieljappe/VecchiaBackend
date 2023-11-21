package com.kodeklubben.vecchiabackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  @Autowired
  com.kodeklubben.vecchiabackend.repository.OrderRepository OrderRepository;

}
