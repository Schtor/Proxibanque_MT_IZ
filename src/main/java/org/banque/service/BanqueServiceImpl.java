package org.banque.service;

import java.util.List;

import org.banque.entity.Client;
import org.banque.persistence.BanqueDAO;
import org.banque.persistence.BanqueDAOImpl;

public class BanqueServiceImpl implements BanqueService {

	private BanqueDAO dao = new BanqueDAOImpl();

	@Override
	public void creerClient(Client client) {
		if (client != null) {
			dao.sauvegarder(client);
		}

	}

	@Override
	public Client chercherClient(Long idClient) {

		return dao.chercherParId(idClient);
	}

	@Override
	public void modifierClient(Long idClient, String nouvNom) {
		dao.modifierClient(idClient, nouvNom);

	}

	@Override
	public void supprimerClient(Long idClient) {
		dao.supprimerClient(idClient);

	}

	@Override
	public List<Client> afficherListe() {

		return dao.afficherTousClients();
	}

}
