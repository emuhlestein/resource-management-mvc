package com.intelliviz.resourcemanagement.repositories;

import com.intelliviz.resourcemanagement.models.ProductTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTypeJpaRepository extends JpaRepository<ProductTypeEntity, Long> {
}
