package com.intelliviz.resourcemanagement.controller;

import com.intelliviz.resourcemanagement.service.ProductTypeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductTypeController {

    private ProductTypeService service;

    private static Logger LOGGER = LogManager.getLogger(ProductTypeController.class);

    public ProductTypeController(ProductTypeService service) {
        this.service = service;
    }

    @GetMapping("/producttype")
    public String showProductTypePage(Model model) {
        LOGGER.debug("In ProductTypeController: showProductTypePage");
        List<String> productTypes = service.getall();
        model.addAttribute("producttypes", productTypes);
        return "producttype";
    }
}
