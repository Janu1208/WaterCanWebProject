<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="adminOpHeader.jsp"></jsp:include><br>
<script type="text/javascript">
function reset()
{
	window.location.href = "updateStock.jsp";

}
</script>
Set Available Cans: 
<input type="text" name="cans" placeholder="Enter the cans" required autofocus  /> <br>
<input type="button"  value="Submit" class="btn btn-success">
<input type="button"  value="Reset" class="btn btn-danger" onclick="reset()">



</body>
</html>