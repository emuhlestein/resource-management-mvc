package com.intelliviz.resourcemanagement.controllers;

import com.intelliviz.resourcemanagement.services.ContainerTypeService;
import com.intelliviz.resourcemanagement.utils.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static com.intelliviz.resourcemanagement.utils.Utils.CONTAINER_TYPES_LINK;

@Controller
public class ContainerTypeController {

    private ContainerTypeService service;

    private static Logger LOGGER = LogManager.getLogger(ContainerTypeService.class);

    public ContainerTypeController(ContainerTypeService service) {
        this.service = service;
    }

    @GetMapping("/containertypes")
    public String showContainerTypesPage(Model model) {
        Utils.setActiveLink(model, CONTAINER_TYPES_LINK);
        model.addAttribute("containertypes", service.getAll());
        return "containertypes";
    }
}
