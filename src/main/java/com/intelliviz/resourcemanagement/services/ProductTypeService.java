package com.intelliviz.resourcemanagement.services;

import com.intelliviz.resourcemanagement.models.ProductTypeEntity;

import java.util.List;

public interface ProductTypeService {
    List<ProductTypeEntity> getall();
    ProductTypeEntity save(ProductTypeEntity productTypeEntity);
    void deleteById(int id);
}
