package com.kodeklubben.vecchiabackend.controller;

import com.kodeklubben.vecchiabackend.model.MenuItem;
import com.kodeklubben.vecchiabackend.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class MenuItemController {

  @Autowired
  MenuItemService menuItemService;

  @GetMapping("/menuItems")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<ArrayList<MenuItem>> getAllMenuItems(){
    ArrayList<MenuItem> menuItems = menuItemService.getAll();
    return new ResponseEntity<>(menuItems, HttpStatus.OK);
  }

}
