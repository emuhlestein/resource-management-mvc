package com.intelliviz.resourcemanagement.services;

import com.intelliviz.resourcemanagement.models.ProductType;
import com.intelliviz.resourcemanagement.models.ProductTypeEntity;
import com.intelliviz.resourcemanagement.repositories.ProductTypeDao;
import com.intelliviz.resourcemanagement.repositories.ProductTypeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {

//    private ProductTypeJpaRepository productTypeJpaRepository;
    private ProductTypeDao productTypeDao;


    @Autowired
    public ProductTypeServiceImpl(ProductTypeDao productTypeDao) {
//        this.productTypeJpaRepository = productTypeJpaRepository;
        this.productTypeDao = productTypeDao;
    }

    //    private List<ProductTypeEntity> productTypeEntities = new ArrayList<>();

//    @Autowired
//    public ProductTypeServiceImpl(ProductTypeJpaRepository productTypeJpaRepository) {
//        this.productTypeJpaRepository = productTypeJpaRepository;
//
//        productTypeEntities.add(new ProductTypeEntity("Grain", "The grains"));
//        productTypeEntities.add(new ProductTypeEntity("Legumes", "The legumes"));
//        productTypeEntities.add(new ProductTypeEntity("Beans", "The beans"));
//        productTypeEntities.add(new ProductTypeEntity("Sugars", "The sugars"));
//        productTypeEntities.add(new ProductTypeEntity("Fats and Oil", "The fats and oils"));
//        productTypeEntities.add(new ProductTypeEntity("Milk", "Milk products"));
//        productTypeEntities.add(new ProductTypeEntity("Baking", "Items needed for baking"));
//    }

    public ProductTypeServiceImpl() {

    }

    public List<ProductType> getall() {
        return productTypeDao.getAll();
    }

    public List<ProductTypeEntity> getallEntities() {
        return Collections.emptyList(); //productTypeJpaRepository.getAll();
//        if(pteList.size() > 0) {
//            return pteList;
//        }
//        return productTypeEntities;
    }

    public ProductType save(ProductType productType) {
        return productTypeDao.addProductType(productType);
//        return productTypeJpaRepository.insert(productTypeEntity.getName(), productTypeEntity.getDescription());
//        productTypeEntities.add(productTypeEntity);
    }

    public void deleteById(int id) {
//        productTypeJpaRepository.deleteById(id);
    }
}
