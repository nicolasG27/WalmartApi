package com.walmartapi.repository;

import com.walmartapi.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    //Un genérico es un tipo de objeto que permite no especificar qué tipo de objeto



}
