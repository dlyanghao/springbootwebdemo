<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8"/>
    <title></title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>
</head>
<body>
    <div class="container">
        <table class="table">
        <#list users as user >
            <tr class="active">
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.address}</td>
                <td>${user.hobby}</td>
                <td>${user.constellation}</td>
            </tr>
        </#list>
        </table>
    </div>
</body>
</html>
