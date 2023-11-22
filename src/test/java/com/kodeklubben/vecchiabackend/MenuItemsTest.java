package com.kodeklubben.vecchiabackend;

import com.kodeklubben.vecchiabackend.controller.MenuItemController;
import com.kodeklubben.vecchiabackend.model.MenuItem;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class MenuItemsTest {

  @Autowired
  private MenuItemController menuItemController;

  @Test
  public void findAll() {
    final ArrayList<MenuItem> menuItems = menuItemController.getAllMenuItems().getBody();
    System.out.println(menuItems);
    assert menuItems != null;
  }


}