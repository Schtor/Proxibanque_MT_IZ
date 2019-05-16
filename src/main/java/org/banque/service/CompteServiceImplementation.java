package org.banque.service;

import org.banque.entity.Compte;
import org.banque.persistence.DAOCompte;
/**
 * Classe ClientServiceImplementation qui implémente l'interface ClientService.
 * Elle est joue le rôled'intermédiaire entre l'utilisateur et la base de
 * données des clients.
 * 
 * @author Marwa & Ihab
 *
 */
public class CompteServiceImplementation implements CompteService {

		DAOCompte dao = new DAOCompte();
		Compte c = null;

		@Override
		public Compte trouverCompte(Long numerocompte) {
			return dao.afficherCompteParNumero(numerocompte);
		}

}
