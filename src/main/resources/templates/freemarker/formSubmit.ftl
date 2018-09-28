<!DOCTYPE html>
<html lang="en">
<head>
<#include "*/header.ftl">
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">

<#include "*/banner.ftl">

<!-- Container (Contact Section) -->
<div id="showcase" class="container-fluid bg-grey text-center">
  <h2>SHOWCASE</h2>
  <h4>Form Submission Example - add customer</h4>
  <br>
 <form name="customer" action="../freemarker/processform" method="post">
  <div class="row col-sm-12">
    <div class="slideanim">
      <div class="row">
      	<div class="col-sm-4 text-right">
      	    <label for="pwd">Name:</label>
      	</div>
        <div class="col-sm-4 form-group">
     
          <input class="form-control" id="name" name="name"  placeholder="Name" type="text" required>
        </div>
       </div>
      <div class="row">
        <div class="col-sm-4 text-right">
         <label for="pwd">Email:</label>
      	</div>  
        <div class="col-sm-4 form-group">
          
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
       <div class="row">
        <div class="col-sm-4 text-right">
         <label for="pwd">Address:</label>
      	</div>   
        <div class="col-sm-4 form-group">
        	
      		<textarea class="form-control" id="address" name="address"  placeholder="address" rows="5"></textarea><br>
           </div>
      </div>
      <div class="row">
      	<div class="col-sm-4">
      	</div>
        <div class="col-sm-4 form-group">
          <button class="btn btn-default pull-right" type="submit">Send</button>
        </div>
      </div>
      
       <div class="row">
      	<div class="col-sm-4">
      	</div>
        <div class="col-sm-4 form-group">
			<h4>${message}</h4>
        </div>
      </div>
      
    </div>
  </div>
</form>
</div>


<#include "*/footer.ftl">


</body>
</html>
