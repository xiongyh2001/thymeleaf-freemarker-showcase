package com.jxiong.showcase.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.ui.Model;

public class BaseController {

	private static final Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	private static final String THYMELEAF_CONTEXTROOT = "thymeleaf/";
	
	private static final String FREEMARKER_CONTEXTROOT = "freemarker/";
	
	private static final String DEFAULT_CONTEXTROOT = "";
	
	protected String forwardPrefixPath;
		
	protected  void getForwardPrefixPath() {
		
		String uri = ServletUriComponentsBuilder.fromCurrentRequestUri().toUriString();	
		
		logger.debug("uri-> {} ", uri);	
		
		if (uri.contains("/thymeleaf")) {
			forwardPrefixPath = THYMELEAF_CONTEXTROOT;
		} else if (uri.contains("/freemarker")){
			forwardPrefixPath = FREEMARKER_CONTEXTROOT;
		} else {
			forwardPrefixPath = DEFAULT_CONTEXTROOT;
		}
		
	}
	
	protected Model setModelBasicAttribute(Model model) {
		
		if (this.forwardPrefixPath.contains("thymeleaf")) {

			model.addAttribute("name", "SpringBoot+Thymeleaf+Bootstrap");
			model.addAttribute("goto", "Freemarker Home");
			model.addAttribute("gotolink", "freemarker/");
		} else if (this.forwardPrefixPath.contains("freemarker")){

			model.addAttribute("name", "SpringBoot+Freemarker+Bootstrap");
			model.addAttribute("goto", "Thymeleaf Home");
			model.addAttribute("gotolink", "thymeleaf/");
		}
		
		return model;
	}

}
