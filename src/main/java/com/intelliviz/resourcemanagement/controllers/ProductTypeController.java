package com.intelliviz.resourcemanagement.controllers;

import com.intelliviz.resourcemanagement.models.ProductTypeEntity;
import com.intelliviz.resourcemanagement.services.ProductTypeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductTypeController {

    private ProductTypeService service;

    private static Logger LOGGER = LogManager.getLogger(ProductTypeController.class);

    public ProductTypeController(ProductTypeService service) {
        this.service = service;
    }

    @GetMapping("/producttypes")
    public String showProductTypePage(Model model) {
        LOGGER.info("In ProductTypeController: showProductTypePage");
        List<ProductTypeEntity> productTypeEntities = service.getall();
        model.addAttribute("producttypes", productTypeEntities);
        return "producttype";
    }

    @GetMapping("/producttypes/{id}")
    public String showProductTypePageForId(@PathVariable int id, Model model) {
        LOGGER.info("In ProductTypeController: showProductTypePageForId: " + id);
        List<ProductTypeEntity> productTypeEntities = service.getall();
        model.addAttribute("producttypes", productTypeEntities);
        return "producttype";
    }

    @GetMapping("/producttype")
//    @ResponseBody
    public String showAddProductTypePage(Model model) {
        LOGGER.info("In ProductTypeController: showProductTypePageForId");
        model.addAttribute("producttype", new ProductTypeEntity());
        return "addproducttype";
    }

    @PostMapping("/producttype")
    public String addProductType(@ModelAttribute ProductTypeEntity productTypeEntity) {
        // save new product type to database
        ProductTypeEntity pte = service.save(productTypeEntity);
        return "redirect:producttypes";
    }
}
