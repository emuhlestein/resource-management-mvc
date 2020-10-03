package com.intelliviz.resourcemanagement.service;

import com.intelliviz.resourcemanagement.model.ProductType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductTypeService {

    private List<ProductType> productTypes = Arrays.asList(
            new ProductType("Grain", "The grains"),
            new ProductType("Legumes", "The legumes"),
            new ProductType("Beans", "The beans"),
            new ProductType("Sugars", "The sugars"),
            new ProductType("Fats and Oil", "The fats and oils"),
            new ProductType("Milk", "Milk products"),
            new ProductType("Baking", "Items needed for baking")
    );

    public ProductTypeService() {
        productTypes = new ArrayList<>();
        productTypes.add(new ProductType("Grain", "The grains"));
        productTypes.add(new ProductType("Legumes", "The legumes"));
        productTypes.add(new ProductType("Beans", "The beans"));
        productTypes.add(new ProductType("Sugars", "The sugars"));
        productTypes.add(new ProductType("Fats and Oil", "The fats and oils"));
        productTypes.add(new ProductType("Milk", "Milk products"));
        productTypes.add(new ProductType("Baking", "Items needed for baking"));
    }

    public List<ProductType> getall() {
        return productTypes;
    }

    public void save(ProductType productType) {
        productTypes.add(productType);
    }
}
