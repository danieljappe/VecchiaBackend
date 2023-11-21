package com.example.vecchiabackend.model;

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
@Table(name = "Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderID")
    private int itemID;

    @Column(name = "Name", length = 100)
    private String name;

    @Column(name = "Description", length = 1000)
    private String description;

    @Column(name = "Price")
    private double price;

    @Column(name = "Phone")
    private String number;

    @Column(name = "Email")
    private String email;

}
