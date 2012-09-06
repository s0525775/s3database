<%-- 
    Document   : resultregister
    Created on : Sep 6, 2012, 2:33:29 PM
    Author     : s0525775
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Verification</title>
    </head>
    <body>
        <h2>Verification</h2>
        <table>
            <tr>
                <td>User name:</td>
                <td>${user.userName}</td>
            </tr>
            <tr>
                <td>Display name:</td>
                <td>${user.displayName}</td>
            </tr>
            <tr>
                <td>E-mail:</td>
                <td>${user.EMail}</td>
            </tr>
            <tr>
                <td>Password:</td>
                <td>${user.password}</td>
            </tr>
        </table>
        <form:form method="POST" commandName="user">
            <form:errors path="*" cssClass="errorblock" element="div" />
                <tr>
                    <td colspan="3">
                        <input type="submit" value="Back" /> 
                        <input type="submit" value="Finish" /> 
                    </td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
