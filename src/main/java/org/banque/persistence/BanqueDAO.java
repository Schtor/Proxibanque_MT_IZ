package org.banque.persistence;

import java.util.List;

import org.banque.entity.Client;

public interface BanqueDAO {

	public void sauvegarder(Client client);

	public Client chercherParId(Long idClient);

	public void modifierClient(Long idClient, String nouveauNom);

	public void supprimerClient(Long idClient);

	public List<Client> afficherTousClients();

}
