package org.banque.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.banque.entity.Client;

public class BanqueDAOImpl implements BanqueDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

	@Override
	public void sauvegarder(Client client) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			em.persist(client);
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

	Client client = null;

	@Override
	public Client chercherParId(Long idClient) {
		EntityManager em1 = emf.createEntityManager();
		EntityTransaction txn1 = em1.getTransaction();
		try {
			txn1.begin();
			client = em1.find(Client.class, idClient);
			txn1.commit();

		} catch (Exception e) {
			if (txn1 != null) {
				txn1.rollback();
			}
			e.printStackTrace();

		} finally {
			if (em1 != null) {
				em1.close();
			}
		}
		return client;
	}

	@Override
	public void modifierClient(Long idClient, String nouveauNom) {
		EntityManager em2 = emf.createEntityManager();
		EntityTransaction txn1 = em2.getTransaction();
		try {
			txn1.begin();
			client = em2.find(Client.class, idClient);
			client.setNom(nouveauNom);
			txn1.commit();

		} catch (Exception e) {
			if (txn1 != null) {
				txn1.rollback();
			}
			e.printStackTrace();

		} finally {
			if (em2 != null) {
				em2.close();
			}
		}

	}

	@Override
	public void supprimerClient(Long idClient) {
		EntityManager em3 = emf.createEntityManager();
		EntityTransaction txn3 = em3.getTransaction();
		try {
			txn3.begin();
			client = em3.find(Client.class, idClient);
			em3.remove(client);
			txn3.commit();

		} catch (Exception e) {
			if (txn3 != null) {
				txn3.rollback();
			}
			e.printStackTrace();

		} finally {
			if (em3 != null) {
				em3.close();
			}
		}

	}

	@Override
	public List<Client> afficherTousClients() {

		EntityManager em2 = emf.createEntityManager();
		EntityTransaction txn2 = em2.getTransaction();

		List<Client> liste = new ArrayList<Client>();

		try {
			txn2.begin();
			TypedQuery<Client> tq = em2.createQuery("FROM Client", Client.class);
			liste = tq.getResultList();

			txn2.commit();

		} catch (Exception e) {
			if (txn2 != null) {
				txn2.rollback();
			}
			e.printStackTrace();

		} finally {
			if (em2 != null) {
				em2.close();
			}
		}

		return liste;
	}

}
