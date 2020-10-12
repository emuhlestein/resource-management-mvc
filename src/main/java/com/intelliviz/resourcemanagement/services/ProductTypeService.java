package com.intelliviz.resourcemanagement.services;

import com.intelliviz.resourcemanagement.models.ProductType;
import com.intelliviz.resourcemanagement.models.ProductTypeEntity;

import java.util.List;

public interface ProductTypeService {
    List<ProductType> getAll();
    List<ProductTypeEntity> getAllEntities();
    ProductType save(ProductType productType);
    void deleteById(int id);
}
