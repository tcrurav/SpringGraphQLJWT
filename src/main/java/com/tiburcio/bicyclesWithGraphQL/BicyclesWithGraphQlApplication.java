package com.tiburcio.bicyclesWithGraphQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BicyclesWithGraphQlApplication {

	public static void main(String[] args) {
		SpringApplication.run(BicyclesWithGraphQlApplication.class, args);
	}

//	@Bean(name = "dataSource")
//	@ConfigurationProperties(prefix = "spring.datasource")
//	public DataSource dataSource() {
//		return (DataSource) DataSourceBuilder.create().build();
//	}
}
