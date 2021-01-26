
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Next age</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <br>
        <br>
        <form action="age" method="POST">
            <label>Enter your age</label>&nbsp;<input type="text" size="20" name="userage" >
            <br>
            <input type="submit" value="Calculator the next birthday">
            <br>
            
        </form>
        <!--displays the information from NewUser object-->
        <label></label>&nbsp;
        <span>${message}</span>
        <br>
        <a href="arithmetic">Arithmetic Calculator</a>
            
    </body>
</html>
