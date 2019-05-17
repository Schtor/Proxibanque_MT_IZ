package org.banque.service;

import org.banque.entity.Compte;
import org.banque.persistence.DAOCo;

/**
 * Interface CompteService joue le r�le d'interm�diaire entre l'utilisateur et
 * la base de donn�es des comptes.
 * 
 * @author Marwa & Ihab
 *
 */
public interface CompteService {

	/**
	 * M�thode appelant la demande d'un compte dans la base de donn�es.
	 * 
	 * @param Long id
	 */
	public Compte trouverCompte(Long numerocompte);

	public void setDAOCompte(DAOCo daoco);

}
