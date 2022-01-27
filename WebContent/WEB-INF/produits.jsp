<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="produits" method="post">
  <label for="fname">Nom du produit</label><br>
  <input type="text" id="fname" name="nom" ><br>
  <label for="lname">Prix</label><br>
  <input type="number" id="pwd" name="prix" ><br><br>
  <label for="lname">Quantite</label><br>
  <input type="number" id="pwd" name="quantite" ><br><br>
  <input type="submit" value="Ajouter">
</form>
 
 
<c:forEach items="${prods}" var="produit"> 
  <p> ${produit.nom} </p>
  
</c:forEach>

<c:choose >
  <c:when test="${a}">ajout réussi</c:when>
  
</c:choose>



  <p> ${error} </p>




</body>
</html>