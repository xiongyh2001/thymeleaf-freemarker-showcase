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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jxiong.showcase.web.domain.Product;
import com.jxiong.showcase.web.domain.Purchase;
import com.jxiong.showcase.web.domain.SearchCriteria;
import com.jxiong.showcase.web.service.ProductService;
import com.jxiong.showcase.web.service.PurchaseService;


@Controller
@RequestMapping({"/thymeleaf", "/freemarker"}) 
public class ProductController extends BaseController {
	
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private ProductService productService;


//	@ModelAttribute("date")
//	public Date getDate() {
//		return new Date();
//	}
//	
//	@GetMapping("/addEditPurchase") 
//	public String showAddForm() {
//		return "/addEditPurchase";
//	}
	
    @PostMapping("/searchproduct")
    public String searchproduct( @Valid @ModelAttribute SearchCriteria searchCriteria, BindingResult result, ModelMap model) {
    	getForwardPrefixPath();
    	logger.debug(">>searchproduct<<starting...");
    	Iterable<String> clist = productService.findProductCategory();
    	Iterable<Product> list;
    	
        if (result.hasErrors()) {
            model.addAttribute("categoryList", clist);
    		model.addAttribute("searchCriteria", searchCriteria);
    		model.addAttribute("productList", null);
            return "browseProduct";
        }

    	
        if ( searchCriteria.getCategory().equalsIgnoreCase("ALL")){
        	if(searchCriteria.getPrice()>=0)
        		list=productService.findProductByPrice(searchCriteria.getPrice());
        	else
        		list=productService.findAllProduct();       	
        } else {
        	if(searchCriteria.getPrice()>=0)
        		list=productService.findProductByCategoryAndPrice(searchCriteria.getCategory(), searchCriteria.getPrice());
        	else
        		list=productService.findProductByCategory(searchCriteria.getCategory());      	
        }
        
        //enpty list
        if (!list.iterator().hasNext() )
        	return "error";
        
        model.addAttribute("categoryList", clist);
		model.addAttribute("searchCriteria", searchCriteria);
		model.addAttribute("productList", list);
    	
		logger.debug(">>searchproduct<<done...");
		
		return "browseProduct";
    }


    
    @GetMapping("/productbrowse")
	public String browseproduct(Model model) {
    	getForwardPrefixPath();
    	logger.debug(">>searchproduct<<starting...");
    	
    	Iterable<String> clist = productService.findProductCategory();
    	
		Iterable<Product> list = productService.findAllProduct(); 
		model.addAttribute("categoryList", clist);
		model.addAttribute("searchCriteria", new SearchCriteria("ALL",0));
		model.addAttribute("productList", list);
		//return new ModelAndView("browseProduct","productList", list);
		
		logger.debug(">>searchproduct<<done...");
		return "browseProduct";
	}
}
