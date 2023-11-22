package com.kodeklubben.vecchiabackend.model;

import jakarta.persistence.*;
import lombok.*;

@ToString
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
    private long itemID;

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
