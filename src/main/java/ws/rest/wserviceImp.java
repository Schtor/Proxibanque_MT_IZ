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
	
	public wserviceImp() {
		dao.scenario();
	}

	@Override
	public Client afficherClient(String id) {
		Long longId = Long.valueOf(id);
		Client client = cs.trouverClient(longId);
		return client;
	}

	@Override
	public Response creerClient(Client client) {
		cs.ajouterClient(client);
		return Response.ok(client).build();
	}

	@Override
	public List<Client> afficherListClients() {

		List<Client> liste = cs.trouverToutClient();
		return liste;
	}

	@Override
	public Response supprimerClient(String idClient) {
		Long longId = Long.valueOf(idClient);
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
