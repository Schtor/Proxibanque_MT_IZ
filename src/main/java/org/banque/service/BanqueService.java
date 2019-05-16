package org.banque.service;

import java.util.List;

import org.banque.entity.Client;

public interface BanqueService {

	public void creerClient(Client client);

	public Client chercherClient(Long idClient);

	public void modifierClient(Long idClient,String nouvNom);
	public void supprimerClient(Long idClient);

	public List<Client> afficherListe();

}
