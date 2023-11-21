package com.example.vecchiabackend.repository;


import com.example.vecchiabackend.model.Employee;
import com.example.vecchiabackend.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
