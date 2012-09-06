<%-- 
    Document   : login.jsp
    Created on : Sep 6, 2012, 5:13:55 PM
    Author     : s0525775
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <style>
            .error {
                    color: #ff0000;
            }

            .errorblock {
                    color: #000;
                    background-color: #ffEEEE;
                    border: 3px solid #ff0000;
                    padding: 8px;
                    margin: 16px;
            }
        </style>
    </head>
    <body>
	<h2>Login</h2>

        <form:form method="POST" commandName="user">
            <form:errors path="*" cssClass="errorblock" element="div" />
            <table>
                <tr>
                    <td>
                        E-mail address:
                    </td>
                    <td>
                        <form:input path="eMail" />
                    </td>
                    <td>
                        <form:errors path="eMail" cssClass="error" />
                    </td>
                </tr>
                <tr>
                    <td>
                        Password:
                    </td>
                    <td>
                        <form:input path="password" />
                    </td>
                    <td>
                        <form:errors path="password" cssClass="error" />
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <input type="submit" value="Submit" /> 
                    </td>
                </tr>
            </table>
	</form:form>
    
    </body>
</html>
