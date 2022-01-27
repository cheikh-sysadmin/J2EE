<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="menu.jsp" %>
<h1>Page d'Accueil </h1>
 
 <h1>  <c:out value="bonjour" />  </h1>
 
<form action="accueil" method="post">
  <label for="fname">Login</label><br>
  <input type="text" id="fname" name="login" ><br>
  <label for="lname">Password:</label><br>
  <input type="password" id="pwd" name="pwd" ><br><br>
  <input type="submit" value="Connexion">
</form>

<h2>
récupération du fomrulaire
</h2>
  <h3>
   ${!empty login ? login : "vueillez remplir le login" }
</h3>

<h3>
  ${!empty pwd ? pwd : "vueillez remplir le mdp" }
</h3>

</body>
</html>