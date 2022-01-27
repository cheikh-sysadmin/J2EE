<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%@include file="menu.jsp" %>

<p style="color:blue;font-weight:bold;"> BONJOUR VOICI MA PREMIERE PAGE JSP </p>
<p style="color:green;font-weight:bold;">
   <%  String nom=(String)request.getAttribute("nom");
   out.println(nom);
   %> 
</p>

<p> 
   <c:if test="${50!=0}" > 
    C'est vrai
   </c:if>

</p>

<p><c:out value="rebonjour" /> </p>
</body>
</html>