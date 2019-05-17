package org.banque.persistence;

import java.util.List;

import org.banque.entity.Client;

public interface DAOPar {

	/**
	 * M�thode permettant de sauvegarder un Particulier dans la table clients.
	 * 
	 * @param Client
	 */
	int sauvegarderClient(Client p);

	/**
	 * M�thode retournant un Particulier de table clients � partir de son id.
	 * 
	 * @param Long id
	 */

	Client afficherClientParId(Long id);

	/**
	 * M�thode retournant la liste de tous les Particulier dans la table clients.
	 * 
	 */
	List<Client> afficherTout();

	/**
	 * M�thode permettant de modifier l'adresse d'un Particulier dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, String adresse
	 */
	void modifierAdresseClientParId(Long id, String adresse);

	/**
	 * M�thode permettant de modifier le code postal d'un Particulier dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, int codePostal
	 */
	void modifierCodePostalClientParId(Long id, Long codePostal);

	/**
	 * M�thode permettant de modifier la ville d'un Particulier dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, String ville
	 */

	void modifierVilleClientParId(Long id, String ville);

	/**
	 * M�thode permettant de modifier le t�l�phone d'un Particulier dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	void modifierTelephoneClientParId(Long id, String telephone);

	/**
	 * M�thode permettant de modifier le pr�nom d'un Particulier dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	void modifierPrenomClientParId(Long id, String prenom);

	/**
	 * M�thode permettant de modifier le nom d'un Particulier dans la table clients
	 * � partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	void modifierNomClientParId(Long id, String nom);

	/**
	 * M�thode permettant de supprimer un Particulier dans la table clients � partir
	 * de son id.
	 * 
	 * @param Long id
	 */

	void supprimerClientParId(Long id);

}