package com.example.vecchiabackend.service;

import com.example.vecchiabackend.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuItemService {

  @Autowired
  MenuItemRepository menuItemRepository;

}
