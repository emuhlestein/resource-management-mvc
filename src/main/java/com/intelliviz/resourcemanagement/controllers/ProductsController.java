package com.intelliviz.resourcemanagement.controllers;

import com.intelliviz.resourcemanagement.utils.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductsController {
    private static Logger LOGGER = LogManager.getLogger(ProductTypeController.class);

    @GetMapping("/products")
    public String showProducts(Model model) {
        LOGGER.info("In ProductsController");
        Utils.setActiveLink(model, Utils.PROD_LINK);
        return "products";
    }
}
