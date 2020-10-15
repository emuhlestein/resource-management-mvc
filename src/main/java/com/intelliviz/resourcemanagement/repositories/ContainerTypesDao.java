package com.intelliviz.resourcemanagement.repositories;

import com.intelliviz.resourcemanagement.models.ContainerType;

import java.util.List;

public interface ContainerTypesDao {
    List<ContainerType> getAll();
    ContainerType insert(ContainerType containerType);
    void deleteById(long id);
}
