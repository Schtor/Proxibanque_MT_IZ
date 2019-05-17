package org.banque.service;

import org.banque.entity.Compte;
import org.banque.persistence.DAOCompte;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Classe ClientServiceImplementation qui implémente l'interface ClientService.
 * Elle est joue le rôled'intermédiaire entre l'utilisateur et la base de
 * données des clients.
 * 
 * @author Marwa & Ihab
 *
 */
public class CompteServiceImplementation implements CompteService {

		private static final Logger LOGGER = LoggerFactory.getLogger(CompteServiceImplementation.class);
		DAOCompte dao = new DAOCompte();
		Compte c = null;

		@Override
		public Compte trouverCompte(Long numerocompte) {
			LOGGER.info("appel à la BD pour : trouver compte");
			return dao.afficherCompteParNumero(numerocompte);
		}

}
