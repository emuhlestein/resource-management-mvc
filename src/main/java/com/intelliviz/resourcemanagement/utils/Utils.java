package com.intelliviz.resourcemanagement.utils;

import org.springframework.ui.Model;

public class Utils {
    public static final String PROD_TYPES_LINK = "prodTypesActive";
    public static final String CONTAINER_TYPES_LINK = "containerTypesActive";
    public static final String PROD_LINK = "prodActive";

    public static void setActiveLink(Model model, String activeLink) {

        model.addAttribute(PROD_TYPES_LINK, "");
        model.addAttribute(CONTAINER_TYPES_LINK, "");
        model.addAttribute(PROD_LINK, "");

        switch(activeLink) {
            case CONTAINER_TYPES_LINK:
                model.addAttribute(CONTAINER_TYPES_LINK, "active");
                break;
            case PROD_LINK:
                model.addAttribute(PROD_LINK, "active");
                break;
            case PROD_TYPES_LINK:
            default:
                model.addAttribute(PROD_TYPES_LINK, "active");
        }
    }
}
