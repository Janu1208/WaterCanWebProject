<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="headers.jsp"></jsp:include><br>
How many cans you want to order?: 
<input type="text" name="name" id="name" placeholder="Enter no.of cans" required autofocus " /><br>
<input type="button"  value="Submit" class="btn btn-success" onclick=login()>

<input type="button"  value="Reset" class="btn btn-danger" onclick=login()><br>