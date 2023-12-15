package com.kodeklubben.vecchiabackend.exceptions;

import com.kodeklubben.vecchiabackend.model.Order;

public class OrderNotFoundException extends RuntimeException {

  public OrderNotFoundException(Order order) {
    super("Provided menu item details are probably incorrect: " + order);
  }
  public OrderNotFoundException(Long id) {
    super("Provided id did not match with any menu item in database: " + id);
  }
}
