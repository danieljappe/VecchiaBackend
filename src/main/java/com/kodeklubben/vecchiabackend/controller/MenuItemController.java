package com.kodeklubben.vecchiabackend.controller;

import com.kodeklubben.vecchiabackend.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class MenuItemController {

  @Autowired
  MenuItemService menuItemService;


}
