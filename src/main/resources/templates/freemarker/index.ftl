<!DOCTYPE html>
<html lang="en">
<head>
<#include "*/header.ftl">
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">

<#include "*/banner.ftl">

<!-- Container (Services Section) -->
<div id="showcase" class="container-fluid text-center">
  <h2>SHOWCASE</h2>
  <h4>What we offer</h4>
  <br>
  <div class="row slideanim">
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-wrench logo-small"></span>
      <h4>BASIC COMPONENTS</h4>
      <p>Html inputText, selectBox, button...</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-check logo-small"></span>
      <h4>FORM VALIDATION</h4>
      <p>Form data binding and validation</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-exclamation-sign logo-small"></span>
      <h4>ERROR</h4>
      <p>Handling error</p>
    </div>
  </div>
  <br><br>
  <div class="row slideanim">
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-menu-hamburger logo-small"></span>
      <h4>MENUS</h4>
      <p>Dynamic menus</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-open-file logo-small"></span>
      <h4>FILE</h4>
      <p>Upload file</p>
    </div>
    <div class="col-sm-4">
      <a href="../freemarker/table"><span class="glyphicon glyphicon-list logo-small"></span></a>
      <h4>DATA</h4>
      <p>Data table, list ...</p>
    </div>
  </div>
   <br><br>
   <div class="row slideanim">
    <div class="col-sm-4">
      <a href="../freemarker/formsubmit"><span class="glyphicon glyphicon-list-alt logo-small"></span></a>
      <h4>FORM SUBMISSION</h4>
      <p>Handling a form submission</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-info-sign logo-small"></span>
      <h4>MESSAGES</h4>
      <p>Display messages</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-duplicate logo-small"></span>
      <h4>OVERLAY</h4>
      <p>Dialog, overlay panel ...</p>
    </div>
  </div>
  
</div>


<#include "*/footer.ftl">


</body>
</html>
