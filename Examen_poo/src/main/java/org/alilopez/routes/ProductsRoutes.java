package org.alilopez.routes;

import io.javalin.Javalin;
import org.alilopez.controller.ProductController;

public class ProductsRoutes {
    private final ProductController ProductController;
    public ProductsRoutes(ProductController ProductController) {
        this.ProductController = ProductController;
    }

    public void register(Javalin app) {
         app.get("/products", ProductController::getAll);
         app.post("/products", ProductController::create);
         // app.get("/products/{id}", ProductController::getById);
        // Ejemplo de más rutas:
        // app.put("/products/:id", ProductController::update);
        // app.delete("/products/:id", ProductController::delete);
    }
}
