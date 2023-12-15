package com.kodeklubben.vecchiabackend.exceptions;

import com.kodeklubben.vecchiabackend.model.MenuItem;

public class MenuItemNotFoundException extends RuntimeException {

  public MenuItemNotFoundException(MenuItem menuItem) {
    super("Provided menu item details are probably incorrect: " + menuItem);
  }
  public MenuItemNotFoundException(Long id) {
    super("Provided id did not match with any menu item in database: " + id);
  }
}
