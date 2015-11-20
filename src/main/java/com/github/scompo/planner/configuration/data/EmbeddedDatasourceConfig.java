package com.github.scompo.planner.configuration.data;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import com.github.scompo.planner.configuration.profiles.Development;

@Configuration
@Development
public class EmbeddedDatasourceConfig implements DatasourceConfiguration {
	
	private static final Logger logger = LoggerFactory.getLogger(EmbeddedDatasourceConfig.class);

	private static final EmbeddedDatabaseType TYPE = EmbeddedDatabaseType.H2;

	@Override
	public DataSource dataSource() {
		
		EmbeddedDatabase embeddedDataSource = new EmbeddedDatabaseBuilder().setType(TYPE).build();

		logger.info("Using embedded datasource: {}", TYPE);

		return embeddedDataSource;
	}

}
