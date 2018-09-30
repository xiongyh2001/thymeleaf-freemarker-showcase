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
	//var oTable = $('#table').DataTable();
	var baseURL = "../actuator/logadmin/";
	
	/**
	 * private functions
	 */

	 
	return {
		initialize : function(){
		    $('#table').DataTable( {
		        "processing": true,
		        "paging":   false,
		        "order": [[ 0, "asc" ]],
		        "ajax": "../actuator/logadmin",
		        "columns": [
			            { "data": "className" },
			            { "data": "effectiveLevel" },
			            { "data": "toChangeclassName" }
			        ],
			    "columnDefs": [ {
			            "targets": 2,
			            "data": "toChangeclassName",
			            "render": function ( data, type, row, meta ) {
	
			            	return '<span>[<a href="TRACE" class="loggerTochange" name="'+data+'">TRACE</a>]</span><span>[<a href="DEBUG" class="loggerTochange" name="'+data+'">DEBUG</a>]</span><span>[<a href="INFO"  class="loggerTochange" name="'+data+'">INFO</a>]</span><span>[<a href="WARN"  class="loggerTochange" name="'+data+'">WARN</a>]</span><span>[<a href="ERROR"  class="loggerTochange" name="'+data+'">ERROR</a>]</span><span>[<a href="OFF" class="loggerTochange" name="'+data+'">OFF</a>]</span>';
			            }
			          },
			          {
			              targets: 0,
			              className: 'dt-body-left'
				      } 
		          ]
	    
		    } );
		    
	    
		    $('#table').on('click', 'a.loggerTochange', function (event) {
		    	
		    	event.preventDefault();
		        //alert( 'You clicked on '+ $(this).attr('href') + ' ' + $(this).attr('name'));
		    	var sendurl = baseURL + $(this).attr('name');
		    	var jReq = {
		    			configuredLevel: $(this).attr('href')
		    	}
		        // Send the data using post	    	
		    	$.ajax({
		            url: sendurl,
		            type: 'post',
		            dataType: 'json',
		            contentType: 'application/json',
		            data: JSON.stringify(jReq),
		            /**
		             * A function to be called if the request succeeds.
		             */
		            success: function (data, textStatus, jqXHR) {
		            	$('#table').DataTable().ajax.reload();
		            	
//		                console.log('jqXHR:');
//		                console.log(jqXHR);
//		                console.log('textStatus:');
//		                console.log(textStatus);
//		                console.log('data:');
//		                console.log(data);
		            },
		            /**
		             * A function to be called if the request fails. 
		             */
		            error: function(jqXHR, textStatus, errorThrown) {
		                alert('An error occurred!');

//		                $('#result').html('<p>status code: '+jqXHR.status+'</p><p>errorThrown: ' + errorThrown + '</p><p>jqXHR.responseText:</p><div>'+jqXHR.responseText + '</div>');
//		                console.log('jqXHR:');
//		                console.log(jqXHR);
//		                console.log('textStatus:');
//		                console.log(textStatus);
//		                console.log('errorThrown:');
//		                console.log(errorThrown);
		            },
		            
		        });
		        
		    } );
		    

		}
	};	
}();

$(document).ready(TABLE.initialize);