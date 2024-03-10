package com.ecommerce.app.ecom.products;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "products")
public class Product {
@Id
@SequenceGenerator(name = "product_sequence", allocationSize = 1)
@GeneratedValue(generator = "product_sequence", strategy = GenerationType.SEQUENCE)
private long id;
private String category;
private String subcategory;
private String name;
private String image;
private float price;
private List<ProductReview> reviews;
private List<ProductSpecification> specifications;

    public Product(long id, String category, String subcategory, String name, String image, float price, List<ProductReview> reviews, List<ProductSpecification> specifications) {
        this.id = id;
        this.category = category;
        this.subcategory = subcategory;
        this.name = name;
        this.image = image;
        this.price = price;
        this.reviews = reviews;
        this.specifications = specifications;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List<ProductReview> getReviews() {
        return reviews;
    }

    public void setReviews(List<ProductReview> reviews) {
        this.reviews = reviews;
    }

    public List<ProductSpecification> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(List<ProductSpecification> specifications) {
        this.specifications = specifications;
    }
}
