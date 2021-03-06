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
import org.banque.entity.Particulier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Cette classe contient les m�thodes permettent de cr�er et sauvegarder des
 * objets Particulier dans la base de donn�es, et �galement d'y acc�der pour,
 * lire, modifier, supprimer et r�cup�rer des informations ou des objets.
 */
public class DAOParticulier implements DAOPar {

	private static final Logger LOGGER = LoggerFactory.getLogger(DAOParticulier.class);
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
	Client p = new Client();
	List<Particulier> l = new ArrayList<Particulier>();
	Set<Particulier> s = new HashSet<Particulier>();

	/**
	 * M�thode permettant de sauvegarder un Particulier dans la table clients.
	 * 
	 * @param Client
	 */
	@Override
	public int sauvegarderClient(Client p) {
		int i = 0;
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			em.persist(p);
			LOGGER.info("client sauvegard� dans la BD");
			i = 1;
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
		return i;
	}

	/**
	 * M�thode retournant un Particulier de table clients � partir de son id.
	 * 
	 * @param Long id
	 */

	@Override
	public Client afficherClientParId(Long id) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Particulier.class, id);
			LOGGER.info("client renvoy� au service");
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
	 * M�thode retournant la liste de tous les Particulier dans la table clients.
	 * 
	 */
	@Override
	public List<Client> afficherTout() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		List<Client> l = new ArrayList<Client>();
		try {
			txn.begin();
			TypedQuery<Client> tq = em.createQuery("FROM Particulier", Client.class);
			l = tq.getResultList();
			LOGGER.info("liste clients renvoy�e au service");
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
	 * M�thode permettant de modifier l'adresse d'un Particulier dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, String adresse
	 */
	@Override
	public void modifierAdresseClientParId(Long id, String adresse) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Particulier.class, id);
			p.setAdresse(adresse);
			LOGGER.info("adresse modifi�e dans la BD");
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
	 * M�thode permettant de modifier le code postal d'un Particulier dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, int codePostal
	 */
	@Override
	public void modifierCodePostalClientParId(Long id, Long codePostal) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Particulier.class, id);
			p.setCodePostal(codePostal);
			LOGGER.info("code psotal modifi� dans la BD");
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
	 * M�thode permettant de modifier la ville d'un Particulier dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, String ville
	 */

	@Override
	public void modifierVilleClientParId(Long id, String ville) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Particulier.class, id);
			p.setVille(ville);
			LOGGER.info("ville modifi�e dans la BD");
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
	 * M�thode permettant de modifier le t�l�phone d'un Particulier dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	@Override
	public void modifierTelephoneClientParId(Long id, String telephone) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Particulier.class, id);
			p.setTelephone(telephone);
			LOGGER.info("telephone modifi� dans la BD");
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
	 * M�thode permettant de modifier le pr�nom d'un Particulier dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	@Override
	public void modifierPrenomClientParId(Long id, String prenom) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Particulier.class, id);
			p.setPrenom(prenom);
			LOGGER.info("SIRET modifi� dans la BD");
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
	 * M�thode permettant de modifier le nom d'un Particulier dans la table clients
	 * � partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	@Override
	public void modifierNomClientParId(Long id, String nom) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Particulier.class, id);
			p.setNom(nom);
			LOGGER.info("nom modifi� dans la BD");
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
	 * M�thode permettant de supprimer un Particulier dans la table clients � partir
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
			p = em.find(Particulier.class, id);
			em.remove(p);
			LOGGER.info("client supprim� dans la BD");
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
