package org.banque.service;

import java.util.ArrayList;
import java.util.List;

import org.banque.entity.Client;
import org.banque.entity.Particulier;
import org.banque.persistence.DAOEnt;
import org.banque.persistence.DAOEntreprise;
import org.banque.persistence.DAOPar;
import org.banque.persistence.DAOParticulier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Classe ClientServiceImplementation qui impl�mente l'interface ClientService.
 * Elle est compos�e des r�gles m�tiers pour le client et joue le r�le
 * d'interm�diaire entre l'utilisateur et la base de donn�es des clients.
 * 
 * @author Marwa & Ihab
 *
 */
public class ClientServiceImplementation implements ClientService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ClientServiceImplementation.class);
	DAOPar daop = new DAOParticulier();
	DAOEnt daoe = new DAOEntreprise();
	Client c = null;

	/**
	 * M�thode appelant la sauvegarde d'un client dans la base de donn�es clients.
	 * Les num�ros de compte (courant, �pargne) et le num�ro de carte bancaire sont
	 * g�n�r�s � condition que le client poss�de ces comptes et une carte bancaire.
	 * 
	 * @param Client c
	 */
	public void ajouterClient(Client c) {
		if (c instanceof Particulier) {
			daop.sauvegarderClient(c);
			LOGGER.info("appel � la BD pour : client particulier ajout�");
		} else {
			daoe.sauvegarderClient(c);
			LOGGER.info("appel � la BD pour : client entreprise ajout�");
		}
	}

	/**
	 * M�thode appelant la demande d'un client dans la base de donn�es clients.
	 * 
	 * @param Long id
	 */
	public Client trouverClient(Long id) {
		c = daop.afficherClientParId(id);
		LOGGER.info("appel � la BD pour : client particulier affich�");
		if (c == null) {
			c = daoe.afficherClientParId(id);
			LOGGER.info("appel � la BD pour : client entreprise affich�");
		}
		
		return c;
	}

	/**
	 * M�thode appelant la demande de tous les client dans la base de donn�es
	 * clients.
	 * 
	 */
	public List<Client> trouverToutClient() {
		List<Client> ls = new ArrayList<Client>();
		List<Client> lp = daop.afficherTout();
		List<Client> le = daoe.afficherTout();
		for (Client client : lp) {
			ls.add(client);
			LOGGER.info("clients particuliers ajout�s � la liste de tous les clients ");
		}
		for (Client client : le) {
			ls.add(client);
			LOGGER.info("clients entreprise ajout�s � la liste de tous les clients");
		}
		LOGGER.info("liste de tous les clients trouv�e");
		return ls;
	}

	/**
	 * M�thode appelant la modification de l'adresse d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param Long id, String adresse
	 */
	public void modifierAdresseClient(Long id, String adresse) {
		if (daop.afficherClientParId(id)!=null) {
			daop.modifierAdresseClientParId(id, adresse);
			LOGGER.info("appel � la BD pour : adresse client particulier modifi�e");
		} else {
			daoe.modifierAdresseClientParId(id, adresse);
			LOGGER.info("appel � la BD pour : adresse client entreprise modifi�e");

		}
	}

	/**
	 * M�thode appelant la modification du SIRET d'une entreprise dans la base de
	 * donn�es clients.
	 * 
	 * @param Long id, String adresse
	 */

	public void modifierSiretClientParId(Long id, Long siret) {
		daoe.modifierSiretClientParId(id, siret);
		LOGGER.info("appel � la BD pour : SIRET client entreprise modifi�");
	}

	/**
	 * M�thode appelant la modification du pr�nom d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param Long id, String adresse
	 */
	public void modifierPrenomClientParId(Long id, String prenom) {
		daop.modifierPrenomClientParId(id, prenom);
		LOGGER.info("appel � la BD pour : prenom client particulier modifi�");
	}

	/**
	 * M�thode appelant la modification du code postal d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param Long id, Long codePostal
	 */
	public void modifierCodePostalClient(Long id, Long codePostal) {
		if (daop.afficherClientParId(id)!=null) {
			daop.modifierCodePostalClientParId(id, codePostal);
			LOGGER.info("appel � la BD pour : code postal client particulier modifi�");
		} else {
			daoe.modifierCodePostalClientParId(id, codePostal);
			LOGGER.info("appel � la BD pour : code postal client entreprise modifi�");
		}
	}

	/**
	 * M�thode appelant la modification de la ville d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param Long id, String ville
	 */
	public void modifierVilleClient(Long id, String ville) {
		if (daop.afficherClientParId(id)!=null) {
			daop.modifierVilleClientParId(id, ville);
			LOGGER.info("appel � la BD pour : ville client particulier modifi�e");
		} else {
			daoe.modifierVilleClientParId(id, ville);
			LOGGER.info("appel � la BD pour : ville client entreprise modifi�e");
		}
	}

	/**
	 * M�thode appelant la modification du num�ro de t�l�phone d'un client dans la
	 * base de donn�es clients.
	 * 
	 * @param Long id, String telephone
	 */
	public void modifierTelephoneClient(Long id, String telephone) {
		if (daop.afficherClientParId(id)!=null) {
			daop.modifierTelephoneClientParId(id, telephone);
			LOGGER.info("appel � la BD pour : telephone client particulier modifi�");
		} else {
			daoe.modifierTelephoneClientParId(id, telephone);
			LOGGER.info("appel � la BD pour : telephone client entreprise modifi�");
		}

	}

	/**
	 * M�thode appelant la modification du num�ro de t�l�phone d'un client dans la
	 * base de donn�es clients.
	 * 
	 * @param Long id, String telephone
	 */
	public void modifierNomClient(Long id, String nom) {
		if (daop.afficherClientParId(id)!=null) {
			daop.modifierNomClientParId(id, nom);
			LOGGER.info("appel � la BD pour : nom client particulier modifi�");
		} else {
			daoe.modifierNomClientParId(id, nom);
			LOGGER.info("appel � la BD pour : nom client entreprise modifi�");
		}

	}

	/**
	 * M�thode appelant la suppression d'un client dans la
	 * base de donn�es clients.
	 * 
	 * @param Long id, String telephone
	 */
	@Override
	public void supprimerClient(Client c) {
		if (c instanceof Particulier) {
			daop.supprimerClientParId(c.getId());
			LOGGER.info("appel � la BD pour supprimer client particulier");
		} else {
			daoe.supprimerClientParId(c.getId());
			LOGGER.info("appel � la BD pour supprimer client entreprise");
		}
	}
	public void setDAOParticulier(DAOPar daop) {
		this.daop=daop;
	}
	public void setDAOEntreprise(DAOEnt daoe) {
		this.daoe=daoe;
	}

}
