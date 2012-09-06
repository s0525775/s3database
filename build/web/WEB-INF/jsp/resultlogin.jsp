<%-- 
    Document   : resultregister
    Created on : Sep 6, 2012, 3:58:41 PM
    Author     : s0525775
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <p align="right"><a href="logout.htm">Logout</a>&nbsp;&nbsp;&nbsp;</p>
        <h2>Your personal information</h2>	
        <p><i>Don't get a shock, but this page is still unformatted. Functionality was more important than design. ;-)</i></p>
        <table>
            <tr>
                <td>User name:</td>
                <td>${awsuser.userName}</td>
            </tr>
            <tr>
                <td>Display name:</td>
                <td>${awsuser.displayName}</td>
            </tr>
            <tr>
                <td>E-mail:</td>
                <td>${awsuser.EMail}</td>
            </tr>
            <tr>
                <td>Password:</td>
                <td>${awsuser.password}</td>
            </tr>
            <tr>
                <td>AWS Access Key Id:</td>
                <td>${awsuser.AWSKeyId}</td>
            </tr>
            <tr>
                <td>AWS Secret Key:</td>
                <td>${awsuser.AWSSecretKey}</td>
            </tr>
        </table>
        <p><b>Please click on Logout when finished.</b></p>
    </body>
</html>
