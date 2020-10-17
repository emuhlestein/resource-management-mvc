package com.intelliviz.resourcemanagement.services;

import com.intelliviz.resourcemanagement.models.ContainerType;
import com.intelliviz.resourcemanagement.repositories.ContainerTypesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContainerTypeServiceImpl implements ContainerTypeService {

    private ContainerTypesDao containerTypesDao;

    @Autowired
    public ContainerTypeServiceImpl(ContainerTypesDao containerTypesDao) {
        this.containerTypesDao = containerTypesDao;
    }

    @Override
    public List<ContainerType> getAll() {
        return containerTypesDao.getAll();
    }

    @Override
    public ContainerType save(ContainerType containerType) {
        return containerTypesDao.insert(containerType);
    }

    @Override
    public void deleteById(int id) {
        containerTypesDao.deleteById(id);
    }
}
