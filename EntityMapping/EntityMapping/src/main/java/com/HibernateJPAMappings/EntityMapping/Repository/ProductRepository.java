package com.HibernateJPAMappings.EntityMapping.Repository;

import com.HibernateJPAMappings.EntityMapping.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
