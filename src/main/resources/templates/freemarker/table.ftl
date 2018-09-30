<!DOCTYPE html>
<html lang="en">
<head>
<#include "*/header.ftl">
<link rel="stylesheet" href="../DataTables/datatables.min.css">
<link rel="stylesheet" href="../DataTables/jquery.dataTables.min.css">
<link rel="stylesheet" href="../css/table.css">
<script src="../DataTables/datatables.min.js"></script>
<script src="../js/table.js"></script>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">

<#include "*/banner.ftl">

<!-- Container (Contact Section) -->
<div id="showcase" class="container-fluid bg-grey text-center">
  <h2>SHOWCASE</h2>
  <h4>Table</h4>
  <br>

<table id="table" class="display cell-border" style="width:100%">
        <thead>
            <tr>
                <th class="dt-head-center">Logger</th>
                <th class="dt-head-center">Effective Level</th>
                <th class="dt-head-center">Change Log Level To</th>

            </tr>
        </thead>
        <tfoot>
            <tr>
                <th class="dt-head-center">Logger</th>
                <th class="dt-head-center">Effective Level</th>
                <th class="dt-head-center">Change Log Level To</th>
            </tr>
        </tfoot>
</table>

</div>

<#include "*/footer.ftl">

</body>
</html>
