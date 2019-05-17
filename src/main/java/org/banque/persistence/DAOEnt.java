package org.banque.persistence;

import java.util.List;

import org.banque.entity.Client;
import org.banque.entity.Entreprise;

public interface DAOEnt {

	/**
	 * M�thode permettant de sauvegarder une Entreprise dans la table Client.
	 * 
	 * @param Client c
	 */
	void sauvegarderClient(Client p);

	/**
	 * M�thode retournant une Entreprise de la table client � partir de son id.
	 * 
	 * @param Long id
	 */

	Entreprise afficherClientParId(Long id);

	/**
	 * M�thode retournant la liste de toutes les Entreprises dans la table clients.
	 * 
	 */
	List<Client> afficherTout();

	/**
	 * M�thode permettant de modifier l'adresse d'une Entreprise dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, String adresse
	 */
	void modifierAdresseClientParId(Long id, String adresse);

	/**
	 * M�thode permettant de modifier le code postal d'une Entreprise dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, int codePostal
	 */
	void modifierCodePostalClientParId(Long id, Long codePostal);

	/**
	 * M�thode permettant de modifier la ville d'une Entreprise dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, String ville
	 */

	void modifierVilleClientParId(Long id, String ville);

	/**
	 * M�thode permettant de modifier le t�l�phone d'une Entreprise dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	void modifierTelephoneClientParId(Long id, String telephone);

	/**
	 * M�thode permettant de modifier le pr�nom d'une Entreprise dans la table
	 * clients � partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	void modifierSiretClientParId(Long id, Long siret);

	/**
	 * M�thode permettant de modifier le nom d'une Entreprise dans la table clients
	 * � partir de son id.
	 * 
	 * @param Long id, String telephone
	 */

	void modifierNomClientParId(Long id, String nom);

	/**
	 * M�thode permettant de supprimer une Entreprise dans la table clients � partir
	 * de son id.
	 * 
	 * @param Long id
	 */

	void supprimerClientParId(Long id);

}