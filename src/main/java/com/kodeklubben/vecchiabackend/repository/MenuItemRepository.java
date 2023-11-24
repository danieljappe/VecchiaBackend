package com.kodeklubben.vecchiabackend.repository;


import com.kodeklubben.vecchiabackend.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    List<MenuItem> findAll();

    Optional<MenuItem> findById(Long id);

    MenuItem save(MenuItem menuItem);


}
