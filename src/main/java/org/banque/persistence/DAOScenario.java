package org.banque.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.banque.entity.CB;
import org.banque.entity.Client;
import org.banque.entity.CompteCourant;
import org.banque.entity.CompteEpargne;
import org.banque.entity.Entreprise;
import org.banque.entity.Particulier;

/**
 * Cette classe contient la méthode permettant de générer la base de données du
 * scénario pré-rédigé.
 */
public class DAOScenario {

	/**
	 * Cette méthode instancie tous les objets nécessaires au scénario, associe des
	 * valeurs à leurs attributs, puis en persistant seulement un conseiller, la
	 * base entière est crée grace aux cascades annotées dans chaque entité.
	 */
	public void scenario() {

		// INSTANCIATIONS EM
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

		// INSTANCIATIONS CLIENTS-CONSEILLER

		Client c1 = new Particulier("Ziada", "Ihab", "176 bd de charonne", 75020L, "Paris", "0635407421");
		Client c2 = new Particulier("Goda", "Florian", "2 rue de l'Orangerie", 77450L, "Suresnes", "0761253457");
		Client c3 = new Particulier("Terradot", "Guillaume", "2 avenue de Paris", 77300L, "Vincennes", "0789224583");
		Client c4 = new Particulier("Alborghetti", "Lucie", "99 boulevard davout", 78874L, "Marseille", "0689471332");
		Client c5 = new Particulier("Roman", "Kinan", "15 avenue Morel", 18644L, "Clichy", "0615884397");
		Client c6 = new Particulier("Barrel", "Melanie", "2 rue maxwell", 41035L, "Lyon", "0689464586");
		Client c7 = new Particulier("Gillet", "Nicolas", "15 rue boule", 51481L, "Lille", "0615846581");
		Client c8 = new Entreprise("Total", "Avenue de France", 75013L, "Paris", "015848745", 18769431L);
		Client c9 = new Entreprise("GDF", "Bd Magenta", 75010L, "Paris", "0154825654", 158691064L);
		Client c10 = new Entreprise("Capgemini", "Boulevard Voltaire", 75011L, "Paris", "0158436584", 18461689432L);

		// INSTANCIATIONS CB-COMPTES
		CB cb1 = new CB(449489149168L, c1);
		CompteCourant cco1 = new CompteCourant(1500, 1616168L, "avril", c1);
		CompteEpargne cce1 = new CompteEpargne(150000, 4522042L, "avril", c1);

		CB cb2 = new CB(74998184914L, c2);
		CompteCourant cco2 = new CompteCourant(18610, 75343435L, "mai", c2);
		CompteEpargne cce2 = new CompteEpargne(1791531, 654328L, "juin", c2);

		CB cb3 = new CB(79416186191L, c3);
		CompteCourant cco3 = new CompteCourant(7816, 8322348L, "juillet", c3);
		CompteEpargne cce3 = new CompteEpargne(94613, 27867458L, "aout", c3);

		CB cb4 = new CB(6109610917814L, c4);
		CompteCourant cco4 = new CompteCourant(947614, 653435434L, "septembre", c4);
		CompteEpargne cce4 = new CompteEpargne(94631, 5643578L, "octobre", c4);

		CB cb5 = new CB(97197841648L, c5);
		CompteCourant cco5 = new CompteCourant(1651, 3545465L, "novembre", c5);
		CompteEpargne cce5 = new CompteEpargne(348146, 565445654L, "decembre", c5);

		CB cb6 = new CB(971918434836641L, c6);
		CompteCourant cco6 = new CompteCourant(38410, 7235834L, "janvier", c6);
		CompteEpargne cce6 = new CompteEpargne(351864, 168724524L, "fevrier", c6);

		CB cb7 = new CB(8916186848L, c7);
		CompteCourant cco7 = new CompteCourant(161, 7585646L, "mars", c7);
		CompteEpargne cce7 = new CompteEpargne(3000, 76752312L, "avril", c7);

		CB cb8 = new CB(191614867641L, c8);
		CompteCourant cco8 = new CompteCourant(80500, 98736538L, "mars", c8);
		CompteEpargne cce8 = new CompteEpargne(1054, 425697864L, "mars", c8);

		CB cb9 = new CB(69194618619L, c9);
		CompteCourant cco9 = new CompteCourant(6811, 97836542L, "septembre", c9);
		CompteEpargne cce9 = new CompteEpargne(16140, 786954548L, "decembre", c9);

		CB cb10 = new CB(971616848646136L, c10);
		CompteCourant cco10 = new CompteCourant(600, 8863453L, "juin", c10);
		CompteEpargne cce10 = new CompteEpargne(350, 56434588L, "mai", c10);

		// SETTERS CLIENTS

		// SETTERS CB-COMPTES-CONSEILLER

		c1.setCb(cb1);
		c2.setCb(cb2);
		c3.setCb(cb3);
		c4.setCb(cb4);
		c5.setCb(cb5);
		c6.setCb(cb6);
		c7.setCb(cb7);
		c8.setCb(cb8);
		c9.setCb(cb9);
		c10.setCb(cb10);

		c1.setCompteco(cco1);
		c2.setCompteco(cco2);
		c3.setCompteco(cco3);
		c4.setCompteco(cco4);
		c5.setCompteco(cco5);
		c6.setCompteco(cco6);
		c7.setCompteco(cco7);
		c8.setCompteco(cco8);
		c9.setCompteco(cco9);
		c10.setCompteco(cco10);
		c1.setCompteE(cce1);
		c2.setCompteE(cce2);
		c3.setCompteE(cce3);
		c4.setCompteE(cce4);
		c5.setCompteE(cce5);
		c6.setCompteE(cce6);
		c7.setCompteE(cce7);
		c8.setCompteE(cce8);
		c9.setCompteE(cce9);
		c10.setCompteE(cce10);

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {

			txn.begin();
			em.persist(c1);
			em.persist(c2);
			em.persist(c3);
			em.persist(c4);
			em.persist(c5);
			em.persist(c6);
			em.persist(c7);
			em.persist(c8);
			em.persist(c9);
			em.persist(c10);
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
