/*******************************************************************************
 * Copyright 2018 Jason Xiong
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
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
