package com.intelliviz.resourcemanagement.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

//@Configuration
//@EnableWebMvc
public class PersistenceConfig extends HikariConfig {
    @Bean
    public HikariDataSource dataSource(Environment env) {
        final HikariDataSource ds = new HikariDataSource(); ds.setMaximumPoolSize(25);
        ds.setDataSourceClassName("com.mysql.cj.jdbc.Driver");
        ds.addDataSourceProperty("url", "jdbc.mysql://localhost:3306/sql_resource_management");
        ds.addDataSourceProperty("user", "root");
        ds.addDataSourceProperty("password", "edwin");
//        ds.setMetricRegistry(metricRegistry);
        return ds;

//        String prop = env.getProperty("spring.datasource.driver-class-name");
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        return DataSourceBuilder.create()
//            .driverClassName("com.mysql.cj.jdbc.Driver")
//            .url("jdbc.mysql://localhost:3306/sql_resource_management")
//            .username("root")
//            .password("edwin")
//            .build();
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
