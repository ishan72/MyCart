package com.ishan.mycart.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
    @Id
    private Long product_id;
    private String product_name;
    private String product_description;
    private double product_price;
    @ManyToOne
    @JoinColumn(name="category_id", nullable = false)
    private Category category;

    public Product() {
    }

    public Long getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public double getProduct_price() {
        return product_price;
    }

    public Category getCategory() {
        return category;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
