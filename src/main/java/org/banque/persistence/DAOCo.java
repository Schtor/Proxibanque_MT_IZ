package org.banque.persistence;

import org.banque.entity.Compte;

public interface DAOCo {

	/**
	 * M�thode retournant un Compte de la base de donn�es � partir du num�ro du compte.
	 * 
	 * @param Long numerocompte
	 */
	Compte afficherCompteParNumero(Long numerocompte);

}