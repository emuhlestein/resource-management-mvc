package com.intelliviz.resourcemanagement.services;

import com.intelliviz.resourcemanagement.models.ProductType;
import com.intelliviz.resourcemanagement.repositories.ProductTypesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeServiceImpl implements ProductTypesService {

    private ProductTypesDao productTypeDao;


    @Autowired
    public ProductTypeServiceImpl(ProductTypesDao productTypeDao) {
        this.productTypeDao = productTypeDao;
    }

    public ProductTypeServiceImpl() {

    }

    public List<ProductType> getAll() {
        return productTypeDao.getAll();
    }

    public ProductType save(ProductType productType) {
        return productTypeDao.insert(productType);
    }

    public void deleteById(int id) {
//        productTypeJpaRepository.deleteById(id);
    }
}
