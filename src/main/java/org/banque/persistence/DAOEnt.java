package org.banque.persistence;

import java.util.List;

import org.banque.entity.Client;
import org.banque.entity.Entreprise;

public interface DAOEnt {

	/**
	 * Méthode permettant de sauvegarder une Entreprise dans la table Client.
	 * 
	 * @param Client c
	 */
	void sauvegarderClient(Client p);

	/**
	 * Méthode retournant une Entreprise de la table client à partir de son id.
	 * 
	 * @param Long id
	 */

	Entreprise afficherClientParId(Long id);

	/**
	 * Méthode retournant la liste de toutes les Entreprises dans la table clients.
	 * 
	 */
	List<Client> afficherTout();

	/**
	 * Méthode permettant de modifier l'adresse d'une Entreprise dans la table
	 * clients à partir de son id.
	 * 
	 * @param Long id, String adresse
	 */
	void modifierAdresseClientParId(Long id, String adresse);

	/**
	 * Méthode permettant de modifier le code postal d'une Entreprise dans la table
	 * clients à partir de son id.
	 * 
	 * @param Long id, int codePostal
	 */
	void modifierCodePostalClientParId(Long id, Long codePostal);

	/**
	 * Méthode permettant de modifier la ville d'une Entreprise dans la table
	 * clients à partir de son id.
	 * 
	 * @param Long id, String ville
	 */

	void modifierVilleClientParId(Long id, String ville);

	/**
	 * Méthode permettant de modifier le téléphone d'une Entreprise dans la table
	 * clients à partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	void modifierTelephoneClientParId(Long id, String telephone);

	/**
	 * Méthode permettant de modifier le prénom d'une Entreprise dans la table
	 * clients à partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	void modifierSiretClientParId(Long id, Long siret);

	/**
	 * Méthode permettant de modifier le nom d'une Entreprise dans la table clients
	 * à partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	void modifierNomClientParId(Long id, String nom);

	/**
	 * Méthode permettant de supprimer une Entreprise dans la table clients à partir
	 * de son id.
	 * 
	 * @param Long id
	 */

	void supprimerClientParId(Long id);

}