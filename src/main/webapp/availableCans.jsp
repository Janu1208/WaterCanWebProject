<!DOCTYPE html>
<html>
<head>
<title>UsersList</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
<script src="js/jQuery.min.js"></script>
<script type="text/javascript">
function View()
{
    var url = "http://localhost:8080/WaterCaneWebProject/ViewStockServlet";
    $.getJSON(url, function(response){
    	console.log(response);
        var data = response;
        var content="";

        document.getElementById("stock").innerHTML="";
        for(let stock of data){
            content += "<tr>";
            content += "<td>" + stock.cans_avail + "</td>";
            content += "<td>" + stock.date.day+"-"+stock.date.month+"-"+stock.date.year + "</td>";
            content += "</tr>";
        }
        document.getElementById("stock").innerHTML = content;
    });
}
</script>
</head>
<body>
    <div id="stock-section">
        <table border="1" class="table table-condensed">
            <thead>
                <tr>
                    <th>cans_avail</th>
                    <th>date</th>
                </tr>
            </thead>
            <tbody id="stock">
            </tbody>
        </table>
    </div>
    <script>
View();
</script>
</body>
</html>
