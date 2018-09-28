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

package com.jxiong.showcase.web.serviceApi;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jxiong.showcase.web.controller.ProductController;
import com.jxiong.showcase.web.domain.Product;
import com.jxiong.showcase.web.repository.ProductRepository;


/**
 * @Class productRestApi
 * @author n0261886
 * <P>
 * @Description:
 * <p>
 */

@RestController
@RequestMapping("/productRestApi")
public class productRestApi {
	
    private static final Logger logger = LoggerFactory.getLogger(productRestApi.class);
    //private static final Logger logger = LogManager.getLogger(ProductController.class);
    
	@Autowired
	private ProductRepository repo;
	
	  @RequestMapping(value="/{id}", method=RequestMethod.GET)
	  public ResponseEntity<Product> getProduct(@PathVariable Integer id) {
		  
		  	logger.debug(">>getProduct<<starting...id " + id);
		  
		    ResponseEntity<Product> response;
	
		    Product product = repo.findById(id.longValue()).get();
	
		    if( product == null ) {
		      response = new ResponseEntity(HttpStatus.NOT_FOUND);
		    } else {
		      response = new ResponseEntity<Product>(product,HttpStatus.OK);
		    }
		    
		    logger.debug(">>getProduct<<done...");
	    
	    return response;
	  }

}
