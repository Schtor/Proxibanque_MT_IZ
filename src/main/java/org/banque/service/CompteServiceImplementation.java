package org.banque.service;

import org.banque.entity.Compte;
import org.banque.persistence.DAOCompte;
/**
 * Classe ClientServiceImplementation qui impl�mente l'interface ClientService.
 * Elle est joue le r�led'interm�diaire entre l'utilisateur et la base de
 * donn�es des clients.
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
