package com.kodeklubben.vecchiabackend.controller;

import com.kodeklubben.vecchiabackend.model.Order;
import com.kodeklubben.vecchiabackend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
public class OrderController {

  @Autowired
  OrderService orderService;

  @GetMapping("/orders")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<ArrayList<Order>> getAll(){
    ArrayList<Order> orders = orderService.getAll();
    return new ResponseEntity<>(orders, HttpStatus.OK);
  }
  @PostMapping(value ="/orders/create", consumes = "application/json")
  public ResponseEntity<Order> create(@RequestBody Order orders) {
    Order createdOrder = orderService.create(orders);
    return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
  }

  @DeleteMapping("/orders/delete/{itemID}")
  public ResponseEntity<Boolean> deleteById(@PathVariable("itemID") Long id){
    boolean deleted = orderService.deleteById(id);
    return new ResponseEntity<>(deleted, HttpStatus.NO_CONTENT);
  }

  @GetMapping("/orders/{itemID}")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<Order> getById(@PathVariable("itemID") Long id){
    Order orders = orderService.getByID(id).get();
    return new ResponseEntity<>(orders, HttpStatus.OK);
  }

  @PostMapping(value ="/orders/update", consumes = "application/json")
  public ResponseEntity<Order> update(@RequestBody Order orders) {
    Order updatedOrder = orderService.update(orders);
    return new ResponseEntity<>(updatedOrder, HttpStatus.CREATED);
  }
  
}
