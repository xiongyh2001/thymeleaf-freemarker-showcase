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
package com.jxiong.showcase.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping({"/thymeleaf", "/freemarker"}) 
public class HomeController  extends BaseController {
	
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    
//	@GetMapping("/index.html")
//	public String getIndex() {
//		getForwardPrefixPath();
//		logger.debug("calling getIndex()");
//		return "redirect:/"+forwardPrefixPath +"home";
//	}
//	
//	@GetMapping("/") 
//	public String getRoot() {
//		getForwardPrefixPath();
//		logger.debug("calling getRoot()");
//		//return "redirect:/demo//index.html";
//		return "redirect:/"+forwardPrefixPath +"home";
//	}
	
    @GetMapping({"/","/index.html","/home"})
	public String home(Model model) {
    	logger.debug(">>HomeController<<starting...");
   	
    	getForwardPrefixPath();

    	model = setModelBasicAttribute(model);
    	
		logger.debug(">>HomeController<<done...");
		return forwardPrefixPath +"index";
	}
}
