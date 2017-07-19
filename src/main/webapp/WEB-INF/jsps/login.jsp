<%--
  Created by IntelliJ IDEA.
  User: shx
  Date: 2017/07/05
  Time: 9:16
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String path =  request.getContextPath();
%>

<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${request.getContextPath()}/res/script/jquery-3.1.1.js" > </script>
    <script type="text/javascript">

        function ajaxTest() {
            $.ajax({
                url: "/user/confirm",
                type:"GET",
                success: function(data){
                    $("body").html(data);
                }
            });
        }
    </script>
</head>
<body>
    <h1>请登录 !${user.name}</h1>
    <form action="/user/confirm" method="post">
        <input type="hidden" name="id" value="${user.id}" />
        <input type="hidden" name="name" value="${user.name}" />
        <input type="hidden" name="age" value="${user.age}" />
        <table style="border: solid;">
            <thead>
                <tr >
                    <td >id</td>
                    <td>name</td>
                    <td>age</td>
                    <td>isConfirmed</td>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.age}</td>
                    <td>${user.isConfirmed}</td>
                </tr>
            </tbody>
        </table>
        <button type="submit">submit</button>
    </form>
    <%--<button type="button" onclick="ajaxTest() ;">submit</button>--%>
    <div id="div1"></div>
</body>

</html>
