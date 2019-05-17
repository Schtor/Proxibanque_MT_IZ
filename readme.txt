	************************************
*****  	Prérequis:   				*****
	************************************

- Assurez-vous que Java est bien installé. Sinon, vous pouvez le télécharger depuis cette adresse : https://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html. 
- Assurez-vous que Eclipse, l’environnement de développement intégré, est bien installé.  Sinon, vous pouvez le télécharger depuis cette adresse : https://www.eclipse.org/downloads/packages/release/2019-03/r/eclipse-ide-enterprise-java-developers.
- Assurez-vous de télécharger et d'installer le XAMPP : https://www.apachefriends.org/download.html
- Assurez-vous de télécharger et d'installer Tomcat. Il est téléchargeable à l'adresse suivante : https://tomcat.apache.org/download-80.cgi.
- Assurez-vous d'installer l'extension RESTer pour Firefox pour pouvoir tester le WebService. Elle est disponible depuis https://addons.mozilla.org/fr/firefox/addon/rester/ . Il suffit de cliquer sur ajouter.
- Assurez-vous de télécharger et d'installer le git : https://git-scm.com/download/win.




	************************************
*****  	Description de l'application:   	*****
	************************************

ProxiBanque est une application visant à gérer les comptes bancaires
des clients dans les différentes agences, ceci afin de pouvoir gérer des dossiers
clients (ajouter un client, afficher les données associées à chacun et effectuer des modifications 
si nécessaire ou meme supprimer un client de la base de donnée de la banque). De plus, l'application 
permet d'effectuer un Audit. 

	************************************
*****  	Livrables:			  	*****
	************************************
	
Vous trouverez les éléments suivants:

1) Le fichier readme.txt : ce document.

2) Les diagrammes UML(diagramme de classe et diagramme de deploiement) et le Mockup dans le dossier conception.

3) La documentation au format javadoc : dossier javadoc.

4) Les sources du projet : dans le dossier ProxiBanqueV3IhabEtMarwa.

5) Le fichier Git.txt contenant le lien git qui vous permet d'accéder directement au projet entier.


	************************************
*****  	Documentation:			  	*****
	************************************
Veuillez suivre les indications suivantes:

1) Ouvrez le projet sur Eclipse.

2) Cliquez Droit run as server. 

3) Utiliser le serveur Tomcat Apache.

4) Rendez vous dans l'interface de phpMyadmin. Vous Trouverez la base de données de la banque intitulée Proxibanque_MT_IZ.

5) Rendez-vous dans le navigateur RESter pour tester le webService:
	5-1 Pour afficher la list des clients, choisissez la méthode GET, dans l'URL mettez le lien suivant: http://localhost:8080/Proxibanque_MT_IZ/services/wservice/clients 
	    Dans Headers, choisir Name: Accept, Value: application/xml ou application/json.
	5-2 Pour afficher un seul client, choisissez la méthode GET, dans l'URL mettez le lien suivant: http://localhost:8080/Proxibanque_MT_IZ/services/wservice/clients/id
	    Le id, choisissez un nombre de 1à10. 
	    Dans Headers, choisir Name: Accept, Value: application/xml ou application/json.
	5-3 Pour ajouter un client dans la base de donnée, choisissez la méthode POST, dans l'URL mettez le lien suivant: http://localhost:8080/Proxibanque_MT_IZ/services/wservice/clients/
	    Dans Headers, choisir Name: Content-Type, Value: application/xml ou application/json.
	    Allez dans le Body et ajoutez un nouveau client.
	    exempls (xml):
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<client>
    <id>1</id>
    <compteco>
        <numeroCompte>1616168</numeroCompte>
        <solde>1500.0</solde>
        <dateOuverture>avril</dateOuverture>
        <autorisationDecouvert>1000</autorisationDecouvert>
    </compteco>
    <compteE>
        <numeroCompte>4522042</numeroCompte>
        <solde>150000.0</solde>
        <dateOuverture>avril</dateOuverture>
        <tauxRemuneration>3</tauxRemuneration>
    </compteE>
    <cb>
        <numeroCarte>449489149168</numeroCarte>
        <plafondRetrait>300</plafondRetrait>
    </cb>
    <nom>Ziada</nom>
    <adresse>176 bd de charonne</adresse>
    <codePostal>75020</codePostal>
    <ville>Paris</ville>
    <telephone>0635407421</telephone>
</client>
	5-4 Pour supprimer un client de la base de donnée, choisissez la méthode DELETE, dans l'URL mettez le lien suivant: http://localhost:8080/Proxibanque_MT_IZ/services/wservice/clients/id
	    Dans Headers, choisir Name: Content-Type, Value: application/xml ou application/json.
	    Le id, choisissez un nombre de 1à10.
	5-5 Pour modifier le nom d'un client de la base de donnée, choisissez la méthode PUT, dans l'URL mettez le lien suivant: http://localhost:8080/Proxibanque_MT_IZ/services/wservice/clientsnom/id
	    Dans Headers, choisir Name: Content-Type, Value: application/xml ou application/json.
	    Le id, choisissez un nombre de 1à10.(Vous pouvez faire pareil pour la ville, le code postal...)
		
Cliquez sur Send à la fin de chaque étape pour valider votre requete.



Veuillez suivre les indications suivantes:

1) Rendez vous dans le dossier javadoc, puis dans le dossier doc.

2) Double cliquez sur 'index.html'.




