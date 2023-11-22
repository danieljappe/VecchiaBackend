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

  public MenuItem update(MenuItem menuItem) {
    menuItemRepository.save(menuItem);
    return menuItem;
  }


}
