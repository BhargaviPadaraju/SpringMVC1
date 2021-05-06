<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>User Registration</h3>

    <form action="/register" method="post" modelAttribute="user">
        <pre>
        <strong>Register Here | <a href="Login.jsp">Click here to Login</a></strong>
       
        User Id: <input type="text" name="userId" />
       
        Password: <input type="password" name="password" />
   
        ConfirmPassword: <input type="password" name="cpassword" />
   
   
        <input type="submit" value="Register" /><input type="reset" value="Clear" />
    </pre>
    </form>
</body>
</html>