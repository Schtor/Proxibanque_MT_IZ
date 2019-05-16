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

/**
 * Cette classe contient les m�thodes permettent de cr�er et sauvegarder des
 * objets Entreprise dans la base de donn�es, et �galement d'y acc�der pour,
 * lire, modifier, supprimer et r�cup�rer des informations ou des objets.
 */
public class DAOEntreprise {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
	Entreprise p = new Entreprise();
	List<Entreprise> l = new ArrayList<Entreprise>();
	Set<Entreprise> s = new HashSet<Entreprise>();

	/**
	 * M�thode permettant de sauvegarder une Entreprise dans la table Client.
	 * 
	 * @param Client c
	 */
	public void sauvegarderClient(Client p) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			em.persist(p);
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
	 * M�thode retournant une Entreprise de la table client � partir de son id.
	 * 
	 * @param Long id
	 */

	public Entreprise afficherClientParId(Long id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
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
	 * M�thode retournant la liste de toutes les Entreprises dans la table clients.
	 * 
	 */
	public List<Client> afficherTout() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		List<Client> l = new ArrayList<Client>();
		try {
			txn.begin();
			TypedQuery<Client> tq = em.createQuery("FROM Entreprise", Client.class);
			l = tq.getResultList();
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
	 * M�thode permettant de modifier l'adresse d'une Entreprise dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, String adresse
	 */
	public void modifierAdresseClientParId(Long id, String adresse) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			p.setAdresse(adresse);
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
	 * M�thode permettant de modifier le code postal d'une Entreprise dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, int codePostal
	 */
	public void modifierCodePostalClientParId(Long id, Long codePostal) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			p.setCodePostal(codePostal);
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
	 * M�thode permettant de modifier la ville d'une Entreprise dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, String ville
	 */

	public void modifierVilleClientParId(Long id, String ville) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			p.setVille(ville);
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
	 * M�thode permettant de modifier le t�l�phone d'une Entreprise dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	public void modifierTelephoneClientParId(Long id, String telephone) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			p.setTelephone(telephone);
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
	 * M�thode permettant de modifier le pr�nom d'une Entreprise dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	public void modifierSiretClientParId(Long id, Long siret) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			p.setNumeroSIRET(siret);
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
	 * M�thode permettant de modifier le nom d'une Entreprise dans la table clients
	 * � partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	public void modifierNomClientParId(Long id, String nom) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			p.setNom(nom);
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
	 * M�thode permettant de supprimer une Entreprise dans la table clients � partir
	 * de son id.
	 * 
	 * @param Long id
	 */

	public void supprimerClientParId(Long id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			em.remove(p);
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
