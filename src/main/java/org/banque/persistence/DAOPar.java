package org.banque.persistence;

import java.util.List;

import org.banque.entity.Client;

public interface DAOPar {

	/**
	 * Méthode permettant de sauvegarder un Particulier dans la table clients.
	 * 
	 * @param Client
	 */
	int sauvegarderClient(Client p);

	/**
	 * Méthode retournant un Particulier de table clients à partir de son id.
	 * 
	 * @param Long id
	 */

	Client afficherClientParId(Long id);

	/**
	 * Méthode retournant la liste de tous les Particulier dans la table clients.
	 * 
	 */
	List<Client> afficherTout();

	/**
	 * Méthode permettant de modifier l'adresse d'un Particulier dans la table
	 * clients à partir de son id.
	 * 
	 * @param Long id, String adresse
	 */
	void modifierAdresseClientParId(Long id, String adresse);

	/**
	 * Méthode permettant de modifier le code postal d'un Particulier dans la table
	 * clients à partir de son id.
	 * 
	 * @param Long id, int codePostal
	 */
	void modifierCodePostalClientParId(Long id, Long codePostal);

	/**
	 * Méthode permettant de modifier la ville d'un Particulier dans la table
	 * clients à partir de son id.
	 * 
	 * @param Long id, String ville
	 */

	void modifierVilleClientParId(Long id, String ville);

	/**
	 * Méthode permettant de modifier le téléphone d'un Particulier dans la table
	 * clients à partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	void modifierTelephoneClientParId(Long id, String telephone);

	/**
	 * Méthode permettant de modifier le prénom d'un Particulier dans la table
	 * clients à partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	void modifierPrenomClientParId(Long id, String prenom);

	/**
	 * Méthode permettant de modifier le nom d'un Particulier dans la table clients
	 * à partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	void modifierNomClientParId(Long id, String nom);

	/**
	 * Méthode permettant de supprimer un Particulier dans la table clients à partir
	 * de son id.
	 * 
	 * @param Long id
	 */

	void supprimerClientParId(Long id);

}