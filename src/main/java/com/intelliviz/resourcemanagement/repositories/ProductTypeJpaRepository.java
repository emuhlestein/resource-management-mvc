package com.intelliviz.resourcemanagement.repositories;

import com.intelliviz.resourcemanagement.models.ProductTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProductTypeJpaRepository extends JpaRepository<ProductTypeEntity, Long> {

    @Query("SELECT pte FROM ProductTypeEntity pte")
    List<ProductTypeEntity> getAll();

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO product_type (name, description) VALUES(:name, :description)", nativeQuery = true)
    int insert(@Param("name") String name, @Param("description") String description);
}
