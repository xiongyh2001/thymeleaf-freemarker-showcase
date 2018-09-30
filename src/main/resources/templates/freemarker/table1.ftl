<!DOCTYPE html>
<html lang="en">
<head>
<#include "*/header.ftl">
<link rel="stylesheet" href="../webjars/bootstrap-table/1.12.1/dist/bootstrap-table.min.css">
<script src="../webjars/bootstrap-table/1.12.1/dist/bootstrap-table.min.js"></script>
<script src="../js/table.js"></script>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">

<#include "*/banner.ftl">

<!-- Container (Contact Section) -->
<div id="showcase" class="container-fluid bg-grey text-center">
  <h2>SHOWCASE</h2>
  <h4>Table</h4>
  <br>
<table id="table"
		data-toggle="table"
		data-search="true" 
>
    <thead>
        <tr>
            <th class="col-xs-6" data-field="className" data-halign="center" data-align="left" data-sortable="true">Logger</th>
            <th class="col-xs-2" data-field="effectiveLevel" data-halign="center" data-align="center" data-sortable="true">Effective Level</th>
            <th class="col-xs-4" data-field="" data-halign="center" data-align="center">Change Log Level To</th>
        </tr>
    </thead>
</table>


</div>

<#include "*/footer.ftl">


</body>
</html>
