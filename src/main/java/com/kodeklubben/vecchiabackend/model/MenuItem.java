package com.kodeklubben.vecchiabackend.model;

import jakarta.persistence.*;
import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MenuItems")
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itemid")
    private long ID;

    @Column(name = "Name", length = 100)
    private String name;

    @Column(name = "Description", length = 1000)
    private String description;

    @Column(name = "Price")
    private double price;

    @Column(name = "Category", length = 50)
    private String category;
}
