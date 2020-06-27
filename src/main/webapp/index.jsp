<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3> <a href="account/findAll">查询所有</a></h3>

    <h3>测试保存</h3>
    <form action="account/save" method="post">
        姓名：<input type="text" name="name"/><br>
        金额：<input type="text" name="money"/><br>
        <input type="submit" value="保存 "/><br>
    </form>

    <h3>根据id删除账户</h3>

    <form action="/account/delete" method="post">
        id:<input type="text" name="id"/><br>
        <input type="submit" value="删除 "/><br>
    </form>

    <h3>根据id修改账户</h3>

    <form action="/account/update" method="post">
        id： <input type="text" name="id"/><br>
        姓名：<input type="text" name="name"/><br>
        金额：<input type="text" name="money"/><br>
        <input type="submit" value="修改 "/><br>
    </form>

</body>
</html>
