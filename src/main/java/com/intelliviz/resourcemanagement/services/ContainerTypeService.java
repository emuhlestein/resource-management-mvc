package com.intelliviz.resourcemanagement.services;

import com.intelliviz.resourcemanagement.models.ContainerType;

import java.util.List;

public interface ContainerTypeService {
    List<ContainerType> getAll();
    ContainerType save(ContainerType containerType);
    void deleteById(int id);
}
