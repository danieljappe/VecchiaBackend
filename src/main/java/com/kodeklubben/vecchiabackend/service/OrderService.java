package com.kodeklubben.vecchiabackend.service;

import com.kodeklubben.vecchiabackend.model.Order;
import com.kodeklubben.vecchiabackend.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class OrderService {

  @Autowired
  OrderRepository orderRepository;

  public ArrayList<Order> getAll(){
    return (ArrayList<Order>) orderRepository.findAll();
  }

  public Optional<Order> getByID(long id){
    return orderRepository.findById(id);
  }

  public Order create(Order order){
    orderRepository.save(order);
    return order;
  }

  public boolean deleteById(long id) {
    try {
      orderRepository.deleteById(id);
      return true;
    } catch (Exception exception) {
      return false;
    }
  }

  public Order update(Order order) {
    orderRepository.save(order);
    return order;
  }

}
