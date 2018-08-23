package com.qa.QACinema.Configuration;


import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class PersistenceConfig {
	@Bean
	@ConfigurationProperties(prefix="spring.datasource")
	@Primary
	public DataSource datasource() {
		return DataSourceBuilder.create().build();
	}

}
