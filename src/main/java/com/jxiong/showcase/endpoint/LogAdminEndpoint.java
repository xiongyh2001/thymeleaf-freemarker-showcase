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

import org.springframework.stereotype.Component;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.logging.LoggersEndpoint;
import org.springframework.boot.logging.LoggingSystem;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@Endpoint(id = "logadmin")
public class LogAdminEndpoint extends LoggersEndpoint{
	
	private static final Logger logger = LoggerFactory.getLogger(LogAdminEndpoint.class);

	private String[] prefixFilters;	
	private final static String SPRINGBOOT_LOGGER_KEY = "loggers";
	
	private List<Object> result = new LinkedList<>();
	private Map<String, Object> myloggers = new LinkedHashMap<>();

	
	public LogAdminEndpoint(LoggingSystem loggingSystem) {
		super(loggingSystem);
		// TODO Auto-generated constructor stub
	}

	@ReadOperation
	public Map<String, Object> loggers(){   
		
        ((Map<String, Object>) super.loggers().get(SPRINGBOOT_LOGGER_KEY)).entrySet().stream()
        				.filter(x -> contains(x.getKey())).forEach( x -> addLogger(x));
        
        myloggers.put(SPRINGBOOT_LOGGER_KEY, result);
        
        return myloggers;
	}

		
	private boolean contains (String className) {
		
		for (String searchStr : prefixFilters)
        {
			logger.debug("contains-> {}", prefixFilters.toString());
            if (StringUtils.containsIgnoreCase(className,searchStr))
            	return true;
        }
		
		return false;
	}
	
	private void addLogger (Entry<String, Object> logger) {
		
		result.add(new ClassLoggers(logger.getKey(), ((LoggerLevels)logger.getValue()).getEffectiveLevel()));
	}
	
	public String[] getPrefixFilters() {
		return prefixFilters;
	}

	public void setPrefixFilters(String[] prefixFilters) {
		this.prefixFilters = prefixFilters;
	}
	
	public static class ClassLoggers {

		private String className;

		private String effectiveLevel;

		public String getClassName() {
			return className;
		}

		public void setClassName(String className) {
			this.className = className;
		}

		public String getEffectiveLevel() {
			return effectiveLevel;
		}

		public void setEffectiveLevel(String effectiveLevel) {
			this.effectiveLevel = effectiveLevel;
		}

		public ClassLoggers(String className, String effectiveLevel) {
			super();
			this.className = className;
			this.effectiveLevel = effectiveLevel;
		}



	}
}



