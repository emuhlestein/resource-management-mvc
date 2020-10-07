package com.intelliviz.resourcemanagement.models;

import com.intelliviz.resourcemanagement.controllers.ProductTypeController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = ProductTypeEntity.TABLE_NAME)
public class ProductTypeEntity {
    public static final String TABLE_NAME="product_type";
    private static Logger LOGGER = LogManager.getLogger(ProductTypeEntity.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;

    @Column(nullable = false, unique = true, length = 64)
    private String name;

    @Column(nullable = false, length = 255)
    private String description;

    @OneToMany(mappedBy = "productType")
    private List<ProductEntity> products = new ArrayList<>();

    public ProductTypeEntity() {
        LOGGER.info("In ProductTypeEntity: default constructor");
    }

    public ProductTypeEntity(String name, String description) {
        LOGGER.info("In ProductTypeEntity: constructor");
        this.id = -1;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void addProduct(ProductEntity product) {
        this.products.add(product);
    }

    public void removeProduct(ProductEntity productEntity) {
        this.products.remove(productEntity);
    }
}
