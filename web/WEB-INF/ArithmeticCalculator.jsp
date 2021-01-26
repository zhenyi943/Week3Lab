
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <br>
        <form action="arithmetic" method="POST">
            
            <label>First：</label>
            <input type="text" name="Fnum" /><br>
            <label>Second：</label>
            <input type="text" name="Snum" />
            <br>
            <input type="submit" name="operator" value="+">
            <input type="submit" name="operator" value="-">
            <input type="submit" name="operator" value="*">
            <input type="submit" name="operator" value="%">
            <br>
        </form>
        <label></label>&nbsp;
        <span>${message}</span>
        <br>
        <a href="age">Age Calculator</a>
    </body>
</html>
