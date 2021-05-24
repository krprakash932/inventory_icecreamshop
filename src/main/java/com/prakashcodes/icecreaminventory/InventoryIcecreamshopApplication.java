package com.prakashcodes.icecreaminventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class InventoryIcecreamshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryIcecreamshopApplication.class, args);
	}

}
