package com.intelliviz.resourcemanagement.repositories;

import com.intelliviz.resourcemanagement.models.ProductTypeEntity;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
import java.util.Collections;
import java.util.List;

@Repository
@Transactional
public class ProductTypeJpaRepository {

//    @PersistenceContext
//    EntityManager em;

    public List<ProductTypeEntity> getAll() {
//        final TypedQuery<ProductTypeEntity> query = em.createQuery("SELECT pte FROM ProductTypeEntity pte", ProductTypeEntity.class);
//        return query.getResultList();
        return Collections.emptyList();
    }

    public ProductTypeEntity findById(long id) {
        return new ProductTypeEntity(); //em.find(ProductTypeEntity.class, id);
    }

    public ProductTypeEntity insert(String name, String description) {
        ProductTypeEntity entity = new ProductTypeEntity(name, description);
//        em.persist(entity);
        return entity;
    }

    public ProductTypeEntity insert(ProductTypeEntity entity) {
//        em.persist(entity);
        return entity;
    }

    public void deleteById(long id) {
        ProductTypeEntity pte = findById(id);
//        em.remove(pte);
    }

//    @Modifying
//    @Transactional
//    @Query(value = "INSERT INTO product_type (name, description) VALUES(:name, :description)", nativeQuery = true)
//    int insert(@Param("name") String name, @Param("description") String description);
}
