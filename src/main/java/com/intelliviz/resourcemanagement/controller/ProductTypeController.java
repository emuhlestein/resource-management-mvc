package com.intelliviz.resourcemanagement.controller;

import com.intelliviz.resourcemanagement.model.ProductType;
import com.intelliviz.resourcemanagement.service.ProductTypeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
        List<ProductType> productTypes = service.getall();
        model.addAttribute("producttypes", productTypes);
        return "producttype";
    }

    @GetMapping("/producttypes/{id}")
    public String showProductTypePageForId(@PathVariable int id, Model model) {
        LOGGER.info("In ProductTypeController: showProductTypePageForId: " + id);
        List<ProductType> productTypes = service.getall();
        model.addAttribute("producttypes", productTypes);
        return "producttype";
    }

    @GetMapping("/producttype")
    public String showAddProductTypePage(Model model) {
        model.addAttribute("producttype", new ProductType());
        return "addproducttype";
    }

    @PostMapping("/producttype")
    public String addProductType() {
        return "redirect:producttypes";
    }
}
