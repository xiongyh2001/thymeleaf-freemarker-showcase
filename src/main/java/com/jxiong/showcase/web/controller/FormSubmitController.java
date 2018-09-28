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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jxiong.showcase.web.form.CustomerForm;
import com.jxiong.showcase.web.service.CustomerService;

@Controller
@RequestMapping({"/thymeleaf", "/freemarker"}) 
public class FormSubmitController  extends BaseController {
	
    private static final Logger logger = LoggerFactory.getLogger(FormSubmitController.class);
    	
	@Autowired
	private CustomerService customerService;
	
    @GetMapping("/formsubmit")
	public String formSubmit(Model model) {
    	logger.debug(">>FormSubmitController<<starting...");
       	
    	getForwardPrefixPath();

    	model = setModelBasicAttribute(model);
    	model.addAttribute("message", "");
    	model.addAttribute("customer", new CustomerForm());
    	
		logger.debug(">>FormSubmitController<<done...");
		return forwardPrefixPath +"formSubmit";

	}
    
    
    @PostMapping("/processform")
	public String processForm(@ModelAttribute("customer") CustomerForm customerForm, Model model) {
    	logger.debug(">>FormSubmitController-FormSubmitted<<starting...");
       	
    	customerService.saveCustomer(customerForm.getCustomer());
    	
    	getForwardPrefixPath();    	
    	model = setModelBasicAttribute(model);
    	model.addAttribute("message", "Customer added!");
    	model.addAttribute("customer", new CustomerForm());
    	   	
		logger.debug(">>FormSubmitController-FormSubmitted<<done...");
		return forwardPrefixPath +"formSubmit";

	}
    
}
