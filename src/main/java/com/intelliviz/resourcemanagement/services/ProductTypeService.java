package com.intelliviz.resourcemanagement.services;

import com.intelliviz.resourcemanagement.models.ProductTypeEntity;
import com.intelliviz.resourcemanagement.repositories.ProductTypeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductTypeService {

    private ProductTypeJpaRepository productTypeJpaRepository;
    private List<ProductTypeEntity> productTypeEntities = new ArrayList<>();

    @Autowired
    public ProductTypeService(ProductTypeJpaRepository productTypeJpaRepository) {
        this.productTypeJpaRepository = productTypeJpaRepository;

        productTypeEntities.add(new ProductTypeEntity("Grain", "The grains"));
        productTypeEntities.add(new ProductTypeEntity("Legumes", "The legumes"));
        productTypeEntities.add(new ProductTypeEntity("Beans", "The beans"));
        productTypeEntities.add(new ProductTypeEntity("Sugars", "The sugars"));
        productTypeEntities.add(new ProductTypeEntity("Fats and Oil", "The fats and oils"));
        productTypeEntities.add(new ProductTypeEntity("Milk", "Milk products"));
        productTypeEntities.add(new ProductTypeEntity("Baking", "Items needed for baking"));
    }

    public ProductTypeService() {

    }

    public List<ProductTypeEntity> getall() {
        List<ProductTypeEntity> pteList = productTypeJpaRepository.getAll();
        if(pteList.size() > 0) {
            return pteList;
        }
        return productTypeEntities;
    }

    public ProductTypeEntity save(ProductTypeEntity productTypeEntity) {
        return productTypeJpaRepository.insert(productTypeEntity);
//        return productTypeJpaRepository.insert(productTypeEntity.getName(), productTypeEntity.getDescription());
//        productTypeEntities.add(productTypeEntity);
    }
}
