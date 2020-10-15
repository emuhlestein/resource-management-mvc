package com.intelliviz.resourcemanagement;

import com.intelliviz.resourcemanagement.repositories.ProductTypesDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ResourceManagementApplication implements CommandLineRunner{

	private static Logger LOGGER = LogManager.getLogger(ResourceManagementApplication.class);

	@Autowired
	ProductTypesDao dao;

	public static void main(String[] args) {
		SpringApplication.run(ResourceManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("All product types -> {}", dao.getAll());
	}
}
