package ws.rest;

import java.util.List;

import javax.ws.rs.core.Response;

import org.banque.entity.Client;
import org.banque.persistence.DAOScenario;
import org.banque.service.ClientService;
import org.banque.service.ClientServiceImplementation;


public class wserviceImp implements wservice {

	private ClientService cs = new ClientServiceImplementation();
	DAOScenario dao = new DAOScenario();
	
	/**
	 * Méthode permettant d'instancier une base de données fournie au démarrage du serveur.
	 * 
	 * 
	 */
	public wserviceImp() {
		dao.scenario();
	}
	
	/**
	 * Méthode permettant d'afficher un client en xml ou en json dans le webservice
	 * à partir de la base de données.
	 * 
	 * @param Long id
	 */
	@Override
	public Client afficherClient(String id) {
		Long longId = Long.valueOf(id);
		Client client = cs.trouverClient(longId);
		return client;
	}

	/**
	 * Méthode appelant la sauvegarde d'un client dans la base de données clients.
	 * Les données entrées en xml ou en json dans le webservice sont prises en compte 
	 * dans le constructeur pour que l'objet client créé en base ait les attributs spécifiés.
	 * 
	 * @param Client c
	 */
	@Override
	public Response creerClient(Client client) {
		cs.ajouterClient(client);
		return Response.ok(client).build();
	}

	/**
	 * Méthode permettant d'afficher la liste de tous les clientq en xml ou en json dans le webservice
	 * à partir de la base de données.
	 * 
	 * @param Long id
	 */
	@Override
	public List<Client> afficherListClients() {

		List<Client> liste = cs.trouverToutClient();
		return liste;
	}

	/**
	 * Méthode permettant de supprimer un client dans la base de donénes à partir du webservice.
	 * 
	 * @param Long id
	 */
	@Override
	public Response supprimerClient(String id) {
		Long longId = Long.valueOf(id);
		Client c = cs.trouverClient(longId);
		Response response = null;
		if (c!=null) {
			cs.supprimerClient(c);;
			response = Response.ok().build();
		} else {
			response = Response.notModified().build();
		}
		return response;
	}

	/**
	 * Méthode permettant de modifier le nom d'un client en base de données, à l'aide d'entrées 
	 * en xml ou en json dans le webservice.
	 *
	 * @param String id, String nom
	 */
	@Override
	public Response modifierNomClient(String id, String nom) {
		Long longId = Long.valueOf(id);
		Client c=cs.trouverClient(longId);
		Response response = null;
		if (c!= null) {
			cs.modifierNomClient(c.getId(), nom);
			response = Response.ok().build();
		} else {
			response = Response.notModified().build();
		}
		return response;
	}

	/**
	 * Méthode permettant de modifier le telephone d'un client en base de données, à l'aide d'entrées 
	 * en xml ou en json dans le webservice.
	 *
	 * @param String id, String telephone
	 */
	@Override
	public Response modifierTelephoneClient(String id, String telephone) {
		Long longId = Long.valueOf(id);
		Client c=cs.trouverClient(longId);
		Response response = null;
		if (c!= null) {
			cs.modifierTelephoneClient(c.getId(), telephone);
			response = Response.ok().build();
		} else {
			response = Response.notModified().build();
		}
		return response;
	
	}

	/**
	 * Méthode permettant de modifier la ville d'un client en base de données, à l'aide d'entrées 
	 * en xml ou en json dans le webservice.
	 *
	 * @param String id, String ville
	 */
	@Override
	public Response modifierVilleClient(String id, String ville) {
		Long longId = Long.valueOf(id);
		Client c=cs.trouverClient(longId);
		Response response = null;
		if (c!= null) {
			cs.modifierVilleClient(c.getId(), ville);
			response = Response.ok().build();
		} else {
			response = Response.notModified().build();
		}
		return response;
	}

	/**
	 * Méthode permettant de modifier le code postal d'un client en base de données, à l'aide d'entrées 
	 * en xml ou en json dans le webservice.
	 *
	 * @param String id, String codepostal
	 */
	@Override
	public Response modifierCodePostalClient(String id, String codepostal) {
		Long longId = Long.valueOf(id);
		Long longcp = Long.valueOf(codepostal);
		Client c=cs.trouverClient(longId);
		Response response = null;
		if (c!= null) {
			cs.modifierCodePostalClient(c.getId(), longcp);
			response = Response.ok().build();
		} else {
			response = Response.notModified().build();
		}
		return response;
	}

	/**
	 * Méthode permettant de modifier l'adresse d'un client en base de données, à l'aide d'entrées 
	 * en xml ou en json dans le webservice.
	 *
	 * @param String id, String adresse
	 */
	@Override
	public Response modifierAdresseClient(String id, String adresse) {
		Long longId = Long.valueOf(id);
		Client c=cs.trouverClient(longId);
		Response response = null;
		if (c!= null) {
			cs.modifierAdresseClient(c.getId(), adresse);
			response = Response.ok().build();
		} else {
			response = Response.notModified().build();
		}
		return response;
	}

}
