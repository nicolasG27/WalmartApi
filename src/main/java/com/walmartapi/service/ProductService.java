package com.walmartapi.service;

import com.walmartapi.ProductEntity;
import com.walmartapi.model.Product;
import com.walmartapi.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product saveProduct(Product product) {

        ProductEntity productEntity = new ProductEntity();
        productEntity.setDescription(product.getDescription());
        productEntity.setPrice(product.getPrice());
        productEntity.setName(product.getName());
        //Por qué no se hace mapping de ID?¨???

        ProductEntity savedEntity = productRepository.save(productEntity);

        //Estamos mapeando aquí de regreso el setName - Crear objetos a partir de otros objetos.
        product.setName(savedEntity.getName());
        product.setPrice(savedEntity.getPrice());
        product.setDescription(savedEntity.getDescription());
        product.setId(savedEntity.getId());



        // map POJO to entity Plane Old Java Object
        // Call DB
        // map entity to POJO

        return product;
    }

    public Product updateProduct(Long id, Product product) {
        //Si está
        ProductEntity productEntity = productRepository.findById(id).get();

        productEntity.setDescription(product.getDescription());
        productEntity.setPrice(product.getPrice());
        productEntity.setName(product.getName());

        ProductEntity savedEntity = productRepository.save(productEntity);

        // Mapeo de regreso
        product.setId(savedEntity.getId());
        product.setName(savedEntity.getName());
        product.setPrice(savedEntity.getPrice());
        product.setDescription(savedEntity.getDescription());

        return product;
    }

    public void deleteProduct(Long id, Product product) {
        productRepository.deleteById(id);
    }


}
