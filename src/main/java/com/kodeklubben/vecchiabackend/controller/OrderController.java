package com.kodeklubben.vecchiabackend.controller;

import com.kodeklubben.vecchiabackend.exceptions.*;
import com.kodeklubben.vecchiabackend.model.Order;
import com.kodeklubben.vecchiabackend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = {"http://127.0.0.1:5500", "https://vecchia-78929.web.app"})
public class OrderController {

  @Autowired
  OrderService orderService;

  @GetMapping("/orders")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<ArrayList<Order>> getAll(){
    final ArrayList<Order> orders = orderService.getAll();
    if (orders == null) throw new GetException("Unable to get all orders. Make sure a valid token is provided.");
    return new ResponseEntity<>(orders, HttpStatus.OK);
  }
  @PostMapping(value ="/orders/create", consumes = "application/json")
  public ResponseEntity<Order> create(@RequestBody Order orders) {
    final Order createdOrder = orderService.create(orders);
    if (createdOrder == null) throw new CreateException(orders, "Make sure a valid token is provided.");
    return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
  }

  @DeleteMapping("/orders/delete/{itemID}")
  public ResponseEntity<Boolean> deleteById(@PathVariable("itemID") Long id){
    final boolean deleted = orderService.deleteById(id);
    if (!deleted) throw new DeleteException(id, "Make sure a valid token is provided");
    return new ResponseEntity<>(true, HttpStatus.NO_CONTENT);
  }

  @GetMapping("/orders/{itemID}")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<Order> getById(@PathVariable("itemID") Long id){
    Order orders = orderService.getByID(id).orElseThrow(() -> new OrderNotFoundException(id));
    return new ResponseEntity<>(orders, HttpStatus.OK);
  }

  @PostMapping(value ="/orders/update", consumes = "application/json")
  public ResponseEntity<Order> update(@RequestBody Order orders) {
    final Order updatedOrder = orderService.update(orders);
    if (updatedOrder == null) throw new UpdateException(orders, "Make sure a valid token is provided");
    return new ResponseEntity<>(updatedOrder, HttpStatus.CREATED);
  }
  
}
