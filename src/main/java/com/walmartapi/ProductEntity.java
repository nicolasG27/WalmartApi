package com.walmartapi;


import jakarta.persistence.*;
import lombok.Data;

@Data

@Entity //hace un mapeo de un objeto con una tabla de base de datos
@Table(name = "products")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
}

//Cuando haces git clone el remoto lo asigna a donde lo clonaste
