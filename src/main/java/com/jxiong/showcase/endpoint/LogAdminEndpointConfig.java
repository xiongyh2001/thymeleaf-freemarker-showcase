package com.jxiong.showcase.endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.logging.LoggingSystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LogAdminEndpointConfig {

	@Value("${logging.admin.prefix.includes}")
	private String[] prefixFilters;	
	
    @Bean
    public LogAdminEndpoint logAdminEndpoint(LoggingSystem loggingSystem) {
    	LogAdminEndpoint logAdminEndpoint = new LogAdminEndpoint(loggingSystem);
    	logAdminEndpoint.setPrefixFilters(prefixFilters);
		return logAdminEndpoint;
    }
    
}
