package com.intelliviz.resourcemanagement.service;

import com.intelliviz.resourcemanagement.model.ProductType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeService {
    public List<ProductType> getall() {
        List<ProductType> productTypes = List.of(
                new ProductType("Grain", "The grains"),
                new ProductType("Legumes", "The legumes"),
                new ProductType("Beans", "The beans"),
                new ProductType("Sugars", "The sugars"),
                new ProductType("Fats and Oil", "The fats and oils"),
                new ProductType("Milk", "Milk products"),
                new ProductType("Baking", "Items needed for baking")
        );
        return productTypes;
    }
}
