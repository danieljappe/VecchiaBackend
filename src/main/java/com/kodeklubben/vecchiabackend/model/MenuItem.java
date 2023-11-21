package com.kodeklubben.vecchiabackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Employees")
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ItemID")
    private int itemID;

    @Column(name = "Name", length = 100)
    private String name;

    @Column(name = "Description", length = 1000)
    private String description;

    @Column(name = "Price")
    private double price;

    @Column(name = "Category", length = 50)
    private String category;
}
