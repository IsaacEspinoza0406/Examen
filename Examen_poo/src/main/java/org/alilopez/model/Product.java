package org.alilopez.model;

public class Product {
    private int idProduct;
    private String Name;
    private int stock;
    private float price;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
