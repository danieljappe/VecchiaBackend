package com.kodeklubben.vecchiabackend.controller;

import com.kodeklubben.vecchiabackend.model.MenuItem;
import com.kodeklubben.vecchiabackend.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class MenuItemController {

  @Autowired
  MenuItemService menuItemService;

  @GetMapping("/menuItems")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<ArrayList<MenuItem>> getAll(){
    ArrayList<MenuItem> menuItems = menuItemService.getAll();
    return new ResponseEntity<>(menuItems, HttpStatus.OK);
  }

  @GetMapping("/menuItems/{itemID}")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<MenuItem> getById(@PathVariable("itemID") Long id){
    MenuItem menuItem = menuItemService.getByID(id).get();
    return new ResponseEntity<>(menuItem, HttpStatus.OK);
  }

  @PostMapping(value ="/menuItems/create", consumes = "application/json")
  public ResponseEntity<MenuItem> create(@RequestBody MenuItem menuItem) {
    MenuItem createdMenuItem = menuItemService.createMenuItem(menuItem);
    return new ResponseEntity<>(createdMenuItem, HttpStatus.CREATED);
  }

  @DeleteMapping("/menuItems/delete/{itemID}")
  public ResponseEntity<Boolean> deleteById(@PathVariable("itemID") Long id){
    boolean deleted = menuItemService.deleteById(id);
    return new ResponseEntity<>(deleted, HttpStatus.NO_CONTENT);
  }

  @PostMapping(value ="/menuItems/update", consumes = "application/json")
  public ResponseEntity<MenuItem> update(@RequestBody MenuItem menuItem) {
    MenuItem updatedMenuItem = menuItemService.update(menuItem);
    return new ResponseEntity<>(updatedMenuItem, HttpStatus.CREATED);
  }

}
