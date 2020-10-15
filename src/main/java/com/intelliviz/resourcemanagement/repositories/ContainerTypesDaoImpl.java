package com.intelliviz.resourcemanagement.repositories;

import com.intelliviz.resourcemanagement.models.ContainerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ContainerTypesDaoImpl implements ContainerTypesDao {

    NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public ContainerTypesDaoImpl(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<ContainerType> getAll() {
        List<ContainerType> containerTypes = jdbcTemplate.query("select * from container_type", (rs, rowNum) -> {
            ContainerType containerType = new ContainerType();
            containerType.setId(rs.getLong("id"));
            containerType.setName(rs.getString("name"));
            containerType.setDescription(rs.getString("description"));
            return containerType;
        });

        return containerTypes;
    }

    @Override
    public ContainerType insert(ContainerType containerType) {
        String sql = "insert into container_type(name, description) values(:name, :description)";
        Map<String, String> params = new HashMap<>();
        params.put("name", containerType.getName());
        params.put("description", containerType.getDescription());
        jdbcTemplate.update(sql, params);
        return containerType;
    }

    @Override
    public void deleteById(long id) {
        String sql = "DELETE FROM container_type WHERE id = :id";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);
        jdbcTemplate.update(sql, params);
    }
}
