package com.dmcsystemsp.dmccommerce.repositories;

import com.dmcsystemsp.dmccommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
