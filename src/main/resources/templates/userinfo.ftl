<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8"/>
    <title></title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>
    <script>
        function deleteUser(id) {
            $.ajax({
                url:"/users",
                type:"delete",
                dataType:"json",
                data:{
                    "id":id
                },
                success:function(response){
                    alert(response.message);
                },
                error:function() {

                }
            });
        }
    </script>
</head>
<body>


<div class="container-fluid">
    <div>
        <p class="text-center font-weight-bold h1">User Infos</p>
    </div>
    <div>
        <table class="table">
        <#list users as user>
            <tr class="active">
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.address}</td>
                <td>${user.hobby}</td>
                <td>${user.constellation}</td>
                <td>
                    <a id="deleUserBtn" class="btn btn-danger" href="javascript:deleteUser('${user.id}')">删除</a>
                </td>
            </tr>
        </#list>
        </table>
    </div>

    <form class="form-horizontal">
        <div class="form-group">
            <label for="name" class="col-sm-2 control-label">Name</label>
            <div class="col-sm-5">
                <input type="text" class="form-control" id="name" placeholder="Name">
            </div>
        </div>
        <div class="form-group">
            <label for="age" class="col-sm-2 control-label">Age</label>
            <div class="col-sm-5">
                <input type="text" class="form-control" id="age" placeholder="Age">
            </div>
        </div>
        <div class="form-group">
            <label for="address" class="col-sm-2 control-label">Address</label>
            <div class="col-sm-5">
                <input type="text" class="form-control" id="address" placeholder="Address">
            </div>
        </div>
        <div class="form-group">
            <label for="hobby" class="col-sm-2 control-label">Hobby</label>
            <div class="col-sm-5">
                <input type="text" class="form-control" id="hobby" placeholder="Hobby">
            </div>
        </div>
        <div class="form-group">
            <label for="constellation" class="col-sm-2 control-label">Constellation</label>
            <div class="col-sm-5">
                <input type="text" class="form-control" id="constellation" placeholder="Constellation">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-5">
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </div>
    </form>
</div>

</body>
</html>
