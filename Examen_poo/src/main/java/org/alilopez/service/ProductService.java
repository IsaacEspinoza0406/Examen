package org.alilopez.service;

import org.alilopez.model.Product;
import org.alilopez.repository.ProductRepository;

import java.sql.SQLException;
import java.util.List;

public class ProductService {
    private final ProductRepository productRepo;
    public ProductService(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getAllUsers() throws SQLException {
        return productRepo.findAll();
    }

    public void create(Product product) throws SQLException {
        // Podrías validar aquí si el email ya existe, etc.
        productRepo.save(product);
    }
}
