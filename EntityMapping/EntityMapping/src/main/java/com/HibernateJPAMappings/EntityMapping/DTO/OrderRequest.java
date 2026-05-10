package com.HibernateJPAMappings.EntityMapping.DTO;


import com.HibernateJPAMappings.EntityMapping.Entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {

    private Customer customer;

}
