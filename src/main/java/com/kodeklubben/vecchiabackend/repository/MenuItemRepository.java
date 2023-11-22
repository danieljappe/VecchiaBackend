package com.kodeklubben.vecchiabackend.repository;


import com.kodeklubben.vecchiabackend.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
  List<MenuItem> findAll();
}