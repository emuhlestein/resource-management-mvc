package com.intelliviz.resourcemanagement.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import javax.persistence.*;

//@Entity
//@Table(name = ProductEntity.TABLE_NAME)
public class ProductEntity {
    public static final String TABLE_NAME="product";
    private static Logger LOGGER = LogManager.getLogger(ProductEntity.class);

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(nullable = false, updatable = false)
    private long id;

//    @Column(nullable = false)
    private float weight;

//    @Column(nullable = false, unique = true, length = 64)
    private String name;

//    @Column(nullable = false, length = 255)
    private String description;

//    @ManyToOne
    private ProductTypeEntity productType;

    public ProductEntity() {
        LOGGER.info("In ProductEntity: default constructor");
    }

    public ProductEntity(String name, String description) {
        LOGGER.info("In ProductEntity: constructor");
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

    public ProductTypeEntity getProductTypeEntity() {
        return productType;
    }

    public void setProductTypeEntity(ProductTypeEntity productTypeEntity) {
        this.productType = productTypeEntity;
    }
}
