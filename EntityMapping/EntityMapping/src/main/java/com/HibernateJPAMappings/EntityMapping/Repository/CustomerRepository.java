package com.HibernateJPAMappings.EntityMapping.Repository;

import com.HibernateJPAMappings.EntityMapping.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
