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
var TABLE = function(){

	/**
	 * private variables
	 */
	var URL = '../actuator/logadmin';
	var jsondata = [];
	/**
	 * private functions
	 */
	 function loadLogAdminEndpointJson()
	 {	
		 jsondata = [];
		 
		 $.getJSON( URL, function(data){

			$.each(data.loggers, function(entryIndex, entry) {
				console.log(entry);
				jsondata.push(entry);	
			});			
		 });

		 console.log(jsondata);

	 }	
	 
	return {
		initialize : function(){
			//$('#table').bootstrapTable({});

			loadLogAdminEndpointJson();
			$('#table').bootstrapTable("load", jsondata);

		}
	};	
}();

$(document).ready(TABLE.initialize);