package com.kodeklubben.vecchiabackend.service;

import com.kodeklubben.vecchiabackend.model.MenuItem;
import com.kodeklubben.vecchiabackend.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MenuItemService {

  @Autowired
  MenuItemRepository menuItemRepository;

  public ArrayList<MenuItem> getAll(){
    final ArrayList<MenuItem> menuItems = (ArrayList<MenuItem>) menuItemRepository.findAll();
    return menuItems;
  }

  public Optional<MenuItem> getByID(long id){
    return menuItemRepository.findById(id);
  }

  public MenuItem createMenuItem(MenuItem menuItem) {
    menuItemRepository.save(menuItem);
    return menuItem;
  }

  public boolean deleteById(long id) {
    try {
      menuItemRepository.deleteById(id);
      return true;
    } catch (Exception exception) {
      return false;
    }
  }

  public MenuItem updateMenuItem(MenuItem menuItem) {
    // Check if the item with the given ID exists in the database
    if (menuItemRepository.existsById(menuItem.getID())) {
      // Update the existing item
      return menuItemRepository.save(menuItem);
    } else {
      // Handle the case where the item with the given ID does not exist
      // You might throw an exception or handle it in another way based on your requirements
      return null;
    }
  }


}
