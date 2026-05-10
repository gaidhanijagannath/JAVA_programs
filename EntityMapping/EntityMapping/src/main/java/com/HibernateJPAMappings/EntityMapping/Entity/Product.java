package com.HibernateJPAMappings.EntityMapping.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Product {

    @Id
    private int productId;
    private String productName;
    private int quantity;
    private int price;
}
