package com.kodeklubben.vecchiabackend.controller;

import com.kodeklubben.vecchiabackend.exceptions.*;
import com.kodeklubben.vecchiabackend.model.MenuItem;
import com.kodeklubben.vecchiabackend.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
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
    if (menuItems == null) throw new GetException("Unable to get all menu items");
    return new ResponseEntity<>(menuItems, HttpStatus.OK);
  }

  @GetMapping("/menuItems/{itemID}")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<MenuItem> getById(@PathVariable("itemID") Long id){
    MenuItem menuItem = menuItemService.getByID(id).orElseThrow(() -> new MenuItemNotFoundException(id));
    return new ResponseEntity<>(menuItem, HttpStatus.OK);
  }

  @PostMapping(value ="/menuItems/create", consumes = "application/json")
  public ResponseEntity<MenuItem> create(@RequestBody MenuItem menuItem) {
    final MenuItem createdMenuItem = menuItemService.createMenuItem(menuItem);
    if (createdMenuItem == null) throw new CreateException(menuItem, "Make sure a token is provided.");
    return new ResponseEntity<>(createdMenuItem, HttpStatus.CREATED);
  }

  @DeleteMapping("/menuItems/delete/{itemID}")
  public ResponseEntity<Boolean> deleteById(@PathVariable("itemID") Long id){
    boolean deleted = menuItemService.deleteById(id);
    if (!deleted) throw new DeleteException(id, "Make sure a token is provided.");
    return new ResponseEntity<>(true, HttpStatus.NO_CONTENT);
  }

  @PutMapping("/menuItems/update/{id}")
  public ResponseEntity<MenuItem> updateMenuItem(@PathVariable(value = "id") long id, @RequestBody MenuItem menuItemDetails) {
    MenuItem menuItem = menuItemService.findById(id).orElseThrow(() -> new MenuItemNotFoundException(menuItemDetails));

    // Update the MenuItem details
    menuItem.setName(menuItemDetails.getName());
    menuItem.setDescription(menuItemDetails.getDescription());
    menuItem.setPrice(menuItemDetails.getPrice());
    menuItem.setCategory(menuItemDetails.getCategory());

    // Save the updated MenuItem
    MenuItem updatedMenuItem = menuItemService.save(menuItem);
    if (updatedMenuItem == null) throw new UpdateException(menuItemDetails, "Make sure a token is provided.");
    return ResponseEntity.ok(updatedMenuItem);
  }

}
