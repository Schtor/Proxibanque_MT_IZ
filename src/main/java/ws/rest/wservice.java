package ws.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.banque.entity.Client;
/**
 * Interface wservice est composée des méthodes pour le webservice, 
 * on peut afficher, creer, supprimer, et modifier un client. Les modifications se font 
 * par attribut. On peut également afficher tous les clients en base de donnée d'un coup dans une liste.
 * 
 * @author Marwa & Ihab
 *
 */
@Produces({ "application/xml", "application/json" })
public interface wservice {
	
	/**
	 * Méthode appelant l'affichage d'un client à partir de la base de données.
	 * 
	 * @param String id
	 */
	@GET
	@Path("/clients/{id}")
	Client afficherClient(@PathParam("id") String id);

	/**
	 * Méthode appelant l'affichage de tous les clients dans une liste à partir de la base de données.
	 * 
	 * @param Client client
	 */
	@GET
	@Path("/clients/")
	List<Client> afficherListClients();

	/**
	 * Méthode appelant la création d'un client dans la base de données à partir du webservice.
	 * 
	 * @param Client client
	 */
	@POST
	@Path("/clients/")
	Response creerClient(Client client);

	/**
	 * Méthode appelant la suppression d'un client à partir de la base de données.
	 * 
	 * @param String id
	 */
	@DELETE
	@Path("/clients/{id}")
	Response supprimerClient(@PathParam("id") String id);

	/**
	 * Méthode appelant la modification du nom d'un client dans la base de données
	 * à partir du webservice.
	 * 
	 * @param String id, String nom
	 */
	@PUT
	@Path("/clientsnom/{id}")
	Response modifierNomClient(@PathParam("id") String id, String nom);
	
	/**
	 * Méthode appelant la modification du telephone d'un client dans la base de données
	 * à partir du webservice.
	 * 
	 * @param String id, String telephone
	 */
	@PUT
	@Path("/clientstelephone/{id}")
	Response modifierTelephoneClient(@PathParam("id") String id, String telephone);
	
	/**
	 * Méthode appelant la modification de la ville d'un client dans la base de données
	 * à partir du webservice.
	 * 
	 * @param String id, String ville
	 */
	@PUT
	@Path("/clientsville/{id}")
	Response modifierVilleClient(@PathParam("id") String id, String ville);
	
	/**
	 * Méthode appelant la modification du code postal d'un client dans la base de données
	 * à partir du webservice.
	 * 
	 * @param String id, String codepostal
	 */
	@PUT
	@Path("/clientscodepostal/{id}")
	Response modifierCodePostalClient(@PathParam("id") String id, String codepostal);

	/**
	 * Méthode appelant la modification de l'adresse d'un client dans la base de données
	 * à partir du webservice.
	 * 
	 * @param String id, String adresse
	 */
	@PUT
	@Path("/clientsadresse/{id}")
	Response modifierAdresseClient(@PathParam("id") String id, String adresse);
}
