package com.kodeklubben.vecchiabackend.repository;

import com.kodeklubben.vecchiabackend.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
