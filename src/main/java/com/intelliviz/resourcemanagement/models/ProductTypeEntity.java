package com.intelliviz.resourcemanagement.models;

import javax.persistence.*;

@Entity
@Table(name = ProductTypeEntity.TABLE_NAME)
public class ProductTypeEntity {
    public static final String TABLE_NAME="product_type";

    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false)
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String description;

    public ProductTypeEntity() {
    }

    public ProductTypeEntity(String name, String description) {
        this.name = name;
        this.description = description;
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
}
