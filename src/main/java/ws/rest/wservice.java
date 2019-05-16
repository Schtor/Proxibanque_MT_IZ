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

@Produces({ "application/xml", "application/json" })
public interface wservice {

	@GET
	@Path("/clients/{id}")
	Client afficherClient(@PathParam("id") String id);

	@GET
	@Path("/clients/")
	List<Client> afficherListClients();

	@POST
	@Path("/clients/")
	Response creerClient(Client client);

	@DELETE
	@Path("/clients/{id}")
	Response supprimerClient(@PathParam("id") String idClient);

	@PUT
	@Path("/clientsnom/{id}")
	Response modifierNomClient(@PathParam("id") String id, String nom);
	
	@PUT
	@Path("/clientstelephone/{id}")
	Response modifierTelephoneClient(@PathParam("id") String id, String telephone);
	
	@PUT
	@Path("/clientsville/{id}")
	Response modifierVilleClient(@PathParam("id") String id, String ville);
	
	@PUT
	@Path("/clientscodepostal/{id}")
	Response modifierCodePostalClient(@PathParam("id") String id, String codepostal);

	@PUT
	@Path("/clientsadresse/{id}")
	Response modifierAdresseClient(@PathParam("id") String id, String adresse);
}
