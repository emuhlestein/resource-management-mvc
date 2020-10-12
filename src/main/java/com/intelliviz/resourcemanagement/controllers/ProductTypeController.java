package com.intelliviz.resourcemanagement.controllers;

import com.intelliviz.resourcemanagement.models.ProductType;
import com.intelliviz.resourcemanagement.models.ProductTypeEntity;
import com.intelliviz.resourcemanagement.services.ProductTypeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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
        model.addAttribute("errorMessage", "The operation failed");
        List<ProductType> productTypes = service.getall();
        model.addAttribute("producttypes", productTypes);
        return "producttype";
    }

    @GetMapping("/producttypes/{id}")
    public String showProductTypePageForId(@PathVariable int id, ModelMap model) {
        LOGGER.info("In ProductTypeController: showProductTypePageForId: " + id);
        List<ProductTypeEntity> productTypeEntities = service.getallEntities();
        model.addAttribute("producttypes", productTypeEntities);
        return "producttype";
    }

//    @GetMapping("/producttype")
//    public String showAddProductTypePage(Model model) {
//        LOGGER.info("In ProductTypeController: showAddProductTypePage");
//        model.addAttribute("producttype", new ProductTypeEntity());
//        return "addproducttype";
//    }

    @GetMapping("/addproducttype")
    public String showAddProductType() {
        return "addproducttype";
    }

    @PostMapping("/producttype")
    public String addProductType(@ModelAttribute ProductType productType) {
        // save new product type to database
        ProductType pte = service.save(productType);
        return "redirect:producttypes";
    }

    @GetMapping("/delete-producttype/{id}")
    public String deleteProductType(@PathVariable int id) {
        // delete the product type
        LOGGER.info("In ProductTypeController: deleteProductType: " + id);
        if(id != -1) {
            service.deleteById(id);
        }
        return "redirect:/producttypes";
    }
}
