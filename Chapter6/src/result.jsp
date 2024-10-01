
<%@ page import="java.io.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Operation Result</title>
</head>
<body>
<%
    String num1Str = request.getParameter("num1");
    String num2Str = request.getParameter("num2");
    String operation = request.getParameter("operation");

    double num1 = Double.parseDouble(num1Str);
    double num2 = Double.parseDouble(num2Str);
    double result = 0;
    String message = "";

    if (operation.equals("multiply")) {
        result = num1 * num2;
        message = "Result of " + num1 + " * " + num2 + " = " + result;
    } else if (operation.equals("divide")) {
        if (num2 != 0) {
            result = num1 / num2;
            message = "Result of " + num1 + " / " + num2 + " = " + result;
        } else {
            message = "Error: Division by zero is not allowed.";
        }
    }
%>
    <h2>Operation Result</h2>
    <p><%= message %></p>
    <a href="index.html">Go Back</a>
</body>
</html>
