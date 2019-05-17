package org.banque.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.banque.entity.Compte;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Cette classe contient les méthodes permettent de créer et sauvegarder des
 * objets Compte dans la base de données, et également d'y accéder pour, lire,
 * modifier, supprimer et récupérer des informations ou des objets.
 */
public class DAOCompte implements DAOCo {

	private static final Logger LOGGER = LoggerFactory.getLogger(DAOCompte.class);
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
	Compte c = new Compte();

	/**
	 * Méthode retournant un Compte de la base de données à partir du numéro du
	 * compte.
	 * 
	 * @param Long numerocompte
	 */
	@Override
	public Compte afficherCompteParNumero(Long numerocompte) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			c = em.find(Compte.class, numerocompte);
			LOGGER.info("compte renvoyé au service");
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
