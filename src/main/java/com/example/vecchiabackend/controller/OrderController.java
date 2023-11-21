package com.example.vecchiabackend.controller;

import com.example.vecchiabackend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class OrderController {

  @Autowired
  OrderService orderService;


}
