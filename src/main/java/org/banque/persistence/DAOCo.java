package org.banque.persistence;

import org.banque.entity.Compte;

public interface DAOCo {

	/**
	 * Méthode retournant un Compte de la base de données à partir du numéro du compte.
	 * 
	 * @param Long numerocompte
	 */
	Compte afficherCompteParNumero(Long numerocompte);

}