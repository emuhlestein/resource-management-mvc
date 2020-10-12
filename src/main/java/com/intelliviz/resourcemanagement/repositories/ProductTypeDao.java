package com.intelliviz.resourcemanagement.repositories;

import com.intelliviz.resourcemanagement.models.ProductType;
import com.intelliviz.resourcemanagement.models.ProductTypeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductTypeDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

//    @Autowired
//    public ProductTypeDao(DataSource dataSource) {
//        this.jdbcTemplate = new JdbcTemplate(dataSource);
//    }

    public List<ProductType> getAll() {
        List<ProductType> productTypes = jdbcTemplate.query("select * from product_type", (rs, rowNum) -> {
            ProductType productType = new ProductType();
            productType.setId(rs.getLong("id"));
            productType.setName(rs.getString("name"));
            productType.setDescription(rs.getString("description"));
            return productType;
        });

        return productTypes;
    }

    public ProductType addProductType(ProductType productType) {
        int i = jdbcTemplate.update("insert into product_type(name, description) values(?,?)", productType.getName(), productType.getDescription());
        return productType;
    }
}
