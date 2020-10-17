package com.intelliviz.resourcemanagement.repositories;

import com.intelliviz.resourcemanagement.models.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductTypeDaoImpl implements ProductTypesDao {

    NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public ProductTypeDaoImpl(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
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

    @Override
    public ProductType insert(ProductType productType) {
        String sql = "insert into product_type(name, description) values(:name, :description)";
        Map<String, String> params = new HashMap<>();
        params.put("name", productType.getName());
        params.put("description", productType.getDescription());
        jdbcTemplate.update(sql, params);
        return productType;
    }

    @Override
    public void deleteById(long id) {
        String sql = "DELETE FROM product_type WHERE id = :id";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);
        jdbcTemplate.update(sql, params);
    }
}
