package org.banque.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.banque.entity.Compte;

/**
 * Cette classe contient les m�thodes permettent de cr�er et sauvegarder des
 * objets Compte dans la base de donn�es, et �galement d'y acc�der pour,
 * lire, modifier, supprimer et r�cup�rer des informations ou des objets.
 */
public class DAOCompte {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
	Compte c = new Compte();

	/**
	 * M�thode retournant un Compte de la base de donn�es � partir du num�ro du compte.
	 * 
	 * @param Long numerocompte
	 */
	public Compte afficherCompteParNumero(Long numerocompte) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			c = em.find(Compte.class, numerocompte);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();

			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}

		}
		return c;
	}
}

