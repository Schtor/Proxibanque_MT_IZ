package org.banque.service;

import java.util.ArrayList;
import java.util.List;

import org.banque.entity.Client;
import org.banque.entity.Particulier;
import org.banque.persistence.DAOEntreprise;
import org.banque.persistence.DAOParticulier;

/**
 * Classe ServiceImplementationClient qui impl�mente l'interface ClientService.
 * Elle est compos�e des r�gles m�tiers pour le client et joue le r�le
 * d'interm�diaire entre l'utilisateur et la base de donn�es des clients.
 * 
 * @author Jean-Charles & Ihab
 *
 */
public class ClientServiceImplementation implements ClientService {

	DAOParticulier daop = new DAOParticulier();
	DAOEntreprise daoe = new DAOEntreprise();
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
		} else {
			daoe.sauvegarderClient(c);
		}
	}

	/**
	 * M�thode appelant la demande d'un client dans la base de donn�es clients.
	 * 
	 * @param int id
	 */
	public Client trouverClient(Long id) {
		c = daop.afficherClientParId(id);
		if (c == null) {
			c = daoe.afficherClientParId(id);
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
		}
		for (Client client : le) {
			ls.add(client);
		}
		return ls;
	}

	/**
	 * M�thode appelant la modification de l'adresse d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param int id, String adresse
	 */
	public void modifierAdresseClient(Long id, String adresse) {
		if (daop.afficherClientParId(id)!=null) {
			daop.modifierAdresseClientParId(id, adresse);
		} else {
			daoe.modifierAdresseClientParId(id, adresse);
		}
	}

	/**
	 * M�thode appelant la modification du SIRET d'une entreprise dans la base de
	 * donn�es clients.
	 * 
	 * @param int id, String adresse
	 */

	public void modifierSiretClientParId(Long id, Long siret) {
		daoe.modifierSiretClientParId(id, siret);
	}

	/**
	 * M�thode appelant la modification du pr�nom d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param int id, String adresse
	 */
	public void modifierPrenomClientParId(Long id, String prenom) {
		daop.modifierPrenomClientParId(id, prenom);
	}

	/**
	 * M�thode appelant la modification du code postal d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param int id, int codePostal
	 */
	public void modifierCodePostalClient(Long id, Long codePostal) {
		if (daop.afficherClientParId(id)!=null) {
			daop.modifierCodePostalClientParId(id, codePostal);
		} else {
			daoe.modifierCodePostalClientParId(id, codePostal);
		}
	}

	/**
	 * M�thode appelant la modification de la ville d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param int id, String ville
	 */
	public void modifierVilleClient(Long id, String ville) {
		if (daop.afficherClientParId(id)!=null) {
			daop.modifierVilleClientParId(id, ville);
		} else {
			daoe.modifierVilleClientParId(id, ville);
		}
	}

	/**
	 * M�thode appelant la modification du num�ro de t�l�phone d'un client dans la
	 * base de donn�es clients.
	 * 
	 * @param int id, String telephone
	 */
	public void modifierTelephoneClient(Long id, String telephone) {
		if (daop.afficherClientParId(id)!=null) {
			daop.modifierTelephoneClientParId(id, telephone);
		} else {
			daoe.modifierTelephoneClientParId(id, telephone);
		}

	}

	/**
	 * M�thode appelant la modification du num�ro de t�l�phone d'un client dans la
	 * base de donn�es clients.
	 * 
	 * @param int id, String telephone
	 */
	public void modifierNomClient(Long id, String nom) {
		if (daop.afficherClientParId(id)!=null) {
			daop.modifierNomClientParId(id, nom);
		} else {
			daoe.modifierNomClientParId(id, nom);
		}

	}

	@Override
	public void supprimerClient(Client c) {
		if (c instanceof Particulier) {
			daop.supprimerClientParId(c.getId());
		} else {
			daoe.supprimerClientParId(c.getId());
		}
	}

}
