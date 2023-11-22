package com.kodeklubben.vecchiabackend.service;

import com.kodeklubben.vecchiabackend.model.MenuItem;
import com.kodeklubben.vecchiabackend.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuItemService {

  @Autowired
  MenuItemRepository menuItemRepository;

  public ArrayList<MenuItem> getAll(){
    final ArrayList<MenuItem> menuItems = (ArrayList<MenuItem>) menuItemRepository.findAll();
    for (MenuItem menuItem : menuItems) System.out.println(menuItem);
    return menuItems;
  }

}
