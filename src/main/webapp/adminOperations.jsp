<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="adminOpHeader.jsp"></jsp:include><br>
<script type="text/javascript">
function logout()
{
	window.location.href = "adminLogin.jsp";

}
</script>

<h3>Welcome admin</h3>
<a href="availableCans.jsp">Available Cans</a><br>

<a href="updateStock.jsp">Update Stock</a><br>
<input type="button"  value="Logout" class="btn btn-primary" onclick= logout()>
</body>
</html>