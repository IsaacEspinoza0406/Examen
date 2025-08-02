package org.alilopez.repository;

import org.alilopez.config.DatabaseConfig;
import org.alilopez.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductRepository {
    public void save(Product product) throws SQLException {
        String query = "INSERT INTO product (name, stock, price) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConfig.getDataSource().getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, product.getName());
            stmt.setInt(2, product.getStock());
            stmt.setFloat(3, product.getPrice());
            stmt.executeUpdate();
        }
    }
}
