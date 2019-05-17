<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="UTF-8">
<title>Liste des Comptes</title>
</head>
<body>
	<img src="logo.png">

	<h1>Affichage de la liste des comptes</h1>


	<table>
		<c:forEach items="${listeClients}" var="client">
			<tr>
				<td>${client.id}</td>
				<%-- 		${cl.nom} ${cl.nom} ${cl.prenom} ${cl.adresse} ${cl.codePostaml} ${cl.ville} ${cl.telephone} ${cl.numeroSIRET} ${cl.cb.numeroCarte} ${cl.compteE.numeroCompte} ${cl.compteco.numeroCompte} --%>
			</tr>
		</c:forEach>
	</table>


	<p />


	<h3>
		Retour à la <a href=Accueil.html> page </a> d'accueil.
	</h3>
</body>
</html>