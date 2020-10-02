package com.intelliviz.resourcemanagement.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeService {
    public List<String> getall() {
        List<String> productTypes = List.of(
                "Grain",
                "Legumes",
                "Beans",
                "Sugars",
                "Fats and Oil",
                "Milk",
                "Baking"
        );
        return productTypes;
    }
}
