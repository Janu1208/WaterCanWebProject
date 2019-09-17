<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<script type="text/javascript">
function canOrder()
{
alert("Your Order has been Sucessfully Placed...!!!");
window.location.href = "userOperations.jsp";
}
</script>
<jsp:include page="headers.jsp"></jsp:include><br>
How many cans you want to order?: 
<input type="text" name="orderCanId" id="OrderCanName" placeholder="Enter no.of cans" required autofocus " /><br>
<input type="submit"  value="Submit" class="btn btn-success" onclick=canOrder()>

<input type="button"  value="Reset" class="btn btn-danger" ><br>