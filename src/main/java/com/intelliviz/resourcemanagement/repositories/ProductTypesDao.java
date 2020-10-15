package com.intelliviz.resourcemanagement.repositories;

import com.intelliviz.resourcemanagement.models.ProductType;
import java.util.List;

public interface ProductTypesDao {
    List<ProductType> getAll();
    ProductType insert(ProductType productType);
    void deleteById(long id);
}
