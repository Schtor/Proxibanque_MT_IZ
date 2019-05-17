package org.banque.service;

import org.banque.entity.Compte;
import org.banque.persistence.DAOCo;

/**
 * Interface CompteService joue le rôle d'intermédiaire entre l'utilisateur et
 * la base de données des comptes.
 * 
 * @author Marwa & Ihab
 *
 */
public interface CompteService {

	/**
	 * Méthode appelant la demande d'un compte dans la base de données.
	 * 
	 * @param Long id
	 */
	public Compte trouverCompte(Long numerocompte);

	public void setDAOCompte(DAOCo daoco);

}
