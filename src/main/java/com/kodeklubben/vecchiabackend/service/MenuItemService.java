package com.kodeklubben.vecchiabackend.service;

import com.kodeklubben.vecchiabackend.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuItemService {

  @Autowired
  MenuItemRepository menuItemRepository;

}
