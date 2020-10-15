package com.intelliviz.resourcemanagement.utils;

import org.springframework.ui.Model;

public class Utils {
    public static final String PROD_TYPES_LINK = "prodTypesActive";
    public static final String PROD_LINK = "prodActive";

    public static void setActiveLink(Model model, String activeLink) {
        if(activeLink.equals(PROD_TYPES_LINK)) {
            model.addAttribute(PROD_TYPES_LINK, "active");
            model.addAttribute(PROD_LINK, "");
        } else {
            model.addAttribute(PROD_TYPES_LINK, "");
            model.addAttribute(PROD_LINK, "active");
        }
    }
}
