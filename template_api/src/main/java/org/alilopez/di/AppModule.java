package org.alilopez.di;

import org.alilopez.controller.UserController;
import org.alilopez.repository.UserRepository;
import org.alilopez.routes.UserRoutes;
import org.alilopez.service.UserService;

import org.alilopez.controller.ProductController;
import org.alilopez.repository.ProductRepository;
import org.alilopez.routes.ProductsRoutes;
import org.alilopez.service.ProductService;

public class AppModule {
    public static UserRoutes initUser() {
        UserRepository userRepo = new UserRepository();
        UserService userService = new UserService(userRepo);
        UserController userController = new UserController(userService);
        return new UserRoutes(userController);
    }

    public static ProductsRoutes initProducts() {
        ProductRepository productRepository = new ProductRepository();
        ProductService ProductService = new ProductService(productRepository);
        ProductController ProductController = new ProductController(ProductService);
        return new ProductsRoutes(ProductController);
    }
}
