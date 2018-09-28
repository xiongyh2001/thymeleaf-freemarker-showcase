package com.jxiong.showcase.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/thymeleaf", "/freemarker"}) 
public class TableController extends BaseController {

	 private static final Logger logger = LoggerFactory.getLogger(TableController.class);
	 
    @GetMapping("/table")
	public String tableProcess(Model model) {
    	logger.debug(">>TableController<<starting...");
       	
    	getForwardPrefixPath();
    	model = setModelBasicAttribute(model);
    	
		logger.debug(">>TableController<<done...");
		return forwardPrefixPath +"table";

	}
}
