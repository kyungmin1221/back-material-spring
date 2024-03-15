package org.sparta.backmaterialspring.common.payment.entities;


import jakarta.persistence.*;
import lombok.Getter;
import org.sparta.backmaterialspring.common.entity.BaseEntity;

@Entity
@Getter
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 255)
    private String name;

    @Column(precision = 10, scale = 2)
    private double price;

    @Column(columnDefinition = "int default 0")
    private int stock;

    @Column(length = 255)
    private String category;

    @Column(length = 1000)
    private String imageUrl;

    @Column(columnDefinition = "text")
    private String description;

    @Column(length = 50)
    private String status = "available";
}