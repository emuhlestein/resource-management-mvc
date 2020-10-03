package com.intelliviz.resourcemanagement.services;

import com.intelliviz.resourcemanagement.models.ProductTypeEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductTypeService {

    private List<ProductTypeEntity> productTypeEntities = Arrays.asList(
            new ProductTypeEntity("Grain", "The grains"),
            new ProductTypeEntity("Legumes", "The legumes"),
            new ProductTypeEntity("Beans", "The beans"),
            new ProductTypeEntity("Sugars", "The sugars"),
            new ProductTypeEntity("Fats and Oil", "The fats and oils"),
            new ProductTypeEntity("Milk", "Milk products"),
            new ProductTypeEntity("Baking", "Items needed for baking")
    );

    public ProductTypeService() {
        productTypeEntities = new ArrayList<>();
        productTypeEntities.add(new ProductTypeEntity("Grain", "The grains"));
        productTypeEntities.add(new ProductTypeEntity("Legumes", "The legumes"));
        productTypeEntities.add(new ProductTypeEntity("Beans", "The beans"));
        productTypeEntities.add(new ProductTypeEntity("Sugars", "The sugars"));
        productTypeEntities.add(new ProductTypeEntity("Fats and Oil", "The fats and oils"));
        productTypeEntities.add(new ProductTypeEntity("Milk", "Milk products"));
        productTypeEntities.add(new ProductTypeEntity("Baking", "Items needed for baking"));
    }

    public List<ProductTypeEntity> getall() {
        return productTypeEntities;
    }

    public void save(ProductTypeEntity productTypeEntity) {
        productTypeEntities.add(productTypeEntity);
    }
}
