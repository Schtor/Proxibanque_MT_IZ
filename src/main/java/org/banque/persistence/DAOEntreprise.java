package org.banque.persistence;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.banque.entity.Client;
import org.banque.entity.Entreprise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Cette classe contient les méthodes permettent de créer et sauvegarder des
 * objets Entreprise dans la base de données, et également d'y accéder pour,
 * lire, modifier, supprimer et récupérer des informations ou des objets.
 */
public class DAOEntreprise implements DAOEnt {

	private static final Logger LOGGER = LoggerFactory.getLogger(DAOEntreprise.class);
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
	Entreprise p = new Entreprise();
	List<Entreprise> l = new ArrayList<Entreprise>();
	Set<Entreprise> s = new HashSet<Entreprise>();

	/**
	 * Méthode permettant de sauvegarder une Entreprise dans la table Client.
	 * 
	 * @param Client c
	 */
	@Override
	public void sauvegarderClient(Client p) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			em.persist(p);
			LOGGER.info("client sauvegardé dans la BD");
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

	}

	/**
	 * Méthode retournant une Entreprise de la table client à partir de son id.
	 * 
	 * @param Long id
	 */

	@Override
	public Entreprise afficherClientParId(Long id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			LOGGER.info("client renvoyé au service");
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
		return p;

	}

	/**
	 * Méthode retournant la liste de toutes les Entreprises dans la table clients.
	 * 
	 */
	@Override
	public List<Client> afficherTout() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		List<Client> l = new ArrayList<Client>();
		try {
			txn.begin();
			TypedQuery<Client> tq = em.createQuery("FROM Entreprise", Client.class);
			l = tq.getResultList();
			LOGGER.info("liste clients renvoyée au service");
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
		return l;
	}

	/**
	 * Méthode permettant de modifier l'adresse d'une Entreprise dans la table
	 * clients à partir de son id.
	 * 
	 * @param Long id, String adresse
	 */
	@Override
	public void modifierAdresseClientParId(Long id, String adresse) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			p.setAdresse(adresse);
			LOGGER.info("adresse modifiée dans la BD");
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
	}

	/**
	 * Méthode permettant de modifier le code postal d'une Entreprise dans la table
	 * clients à partir de son id.
	 * 
	 * @param Long id, int codePostal
	 */
	@Override
	public void modifierCodePostalClientParId(Long id, Long codePostal) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			p.setCodePostal(codePostal);
			LOGGER.info("code psotal modifié dans la BD");
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
	}

	/**
	 * Méthode permettant de modifier la ville d'une Entreprise dans la table
	 * clients à partir de son id.
	 * 
	 * @param Long id, String ville
	 */

	@Override
	public void modifierVilleClientParId(Long id, String ville) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			p.setVille(ville);
			LOGGER.info("ville modifiée dans la BD");
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
	}

	/**
	 * Méthode permettant de modifier le téléphone d'une Entreprise dans la table
	 * clients à partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	@Override
	public void modifierTelephoneClientParId(Long id, String telephone) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			p.setTelephone(telephone);
			LOGGER.info("telephone modifié dans la BD");
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
	}

	/**
	 * Méthode permettant de modifier le prénom d'une Entreprise dans la table
	 * clients à partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	@Override
	public void modifierSiretClientParId(Long id, Long siret) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			p.setNumeroSIRET(siret);
			LOGGER.info("SIRET modifié dans la BD");
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
	}

	/**
	 * Méthode permettant de modifier le nom d'une Entreprise dans la table clients
	 * à partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	@Override
	public void modifierNomClientParId(Long id, String nom) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			p.setNom(nom);
			LOGGER.info("nom modifié dans la BD");
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
	}

	/**
	 * Méthode permettant de supprimer une Entreprise dans la table clients à partir
	 * de son id.
	 * 
	 * @param Long id
	 */

	@Override
	public void supprimerClientParId(Long id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			em.remove(p);
			LOGGER.info("client supprimé dans la BD");
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
	}
}
