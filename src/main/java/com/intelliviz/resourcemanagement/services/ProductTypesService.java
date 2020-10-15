package com.intelliviz.resourcemanagement.services;

import com.intelliviz.resourcemanagement.models.ProductType;

import java.util.List;

public interface ProductTypesService {
    List<ProductType> getAll();
    ProductType save(ProductType productType);
    void deleteById(int id);
}
