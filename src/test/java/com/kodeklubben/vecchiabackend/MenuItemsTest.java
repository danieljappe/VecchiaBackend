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
    final ArrayList<MenuItem> menuItems = menuItemController.getAll().getBody();
    System.out.println(menuItems);
    assert menuItems != null;
  }

  @Test
  public void findByID() {
    MenuItem menuItem = menuItemController.getById(1L).getBody();
    System.out.println(menuItem);
    assert menuItem != null;
  }

  @Test
  public void create() {
    final MenuItem menuItem = new MenuItem();
    menuItem.setName("Salatpizza");
    final MenuItem createdMenuItem = menuItemController.create(menuItem).getBody();
    System.out.println(createdMenuItem);
    assert createdMenuItem != null && Boolean.TRUE.equals(menuItemController.deleteById(createdMenuItem.getID()).getBody());
  }

  /*@Test
  public void update() {
    //get all
    final ArrayList<MenuItem> menuItems = menuItemController.getAll().getBody();

    //select first
    assert menuItems != null;
    MenuItem menuItem = menuItems.get(0);
    menuItem.setName("updated name");

    //update
    menuItem = menuItemController.update(menuItem).getBody();
    assert menuItem.getName().equals("updated name");

    //update back to name
    menuItem.setName("name");
    menuItemController.update(menuItem).getBody();
  }*/


}