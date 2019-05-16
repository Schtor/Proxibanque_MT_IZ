package org.banque.service;

import java.util.List;

import org.banque.entity.Client;

/**
 * Interface ClientService est composée des règles métiers pour le client et
 * joue le rôle d'intermédiaire entre l'utilisateur et la base de données des
 * clients.
 * 
 * @author Marwa & Ihab
 *
 */
public interface ClientService {

	/**
	 * Méthode appelant la sauvegarde d'un client dans la base de données clients.
	 * 
	 * @param Client c
	 */
	public void ajouterClient(Client c);

	/**
	 * Méthode appelant la demande d'un client dans la base de données clients.
	 * 
	 * @param Long id
	 */
	public Client trouverClient(Long id);

	/**
	 * Méthode appelant la demande de tous les client dans la base de données
	 * clients.
	 * 
	 */
	public List<Client> trouverToutClient();

	/**
	 * Méthode appelant la modification de l'adresse d'un client dans la base de
	 * données clients.
	 * 
	 * @param Long id, String adresse
	 */
	public void modifierAdresseClient(Long id, String adresse);

	/**
	 * Méthode appelant la modification du code postal d'un client dans la base de
	 * données clients.
	 * 
	 * @param Long id, Long codePostal
	 */
	public void modifierCodePostalClient(Long id, Long codePostal);

	/**
	 * Méthode appelant la modification de la ville d'un client dans la base de
	 * données clients.
	 * 
	 * @param Long id, String ville
	 */
	public void modifierVilleClient(Long id, String ville);

	/**
	 * Méthode appelant la modification du numéro de téléphone d'un client dans la
	 * base de données clients.
	 * 
	 * @param Long id, String telephone
	 */
	public void modifierTelephoneClient(Long id, String telephone);
	
	/**
	 * Méthode appelant la modification du nom d'un client dans la
	 * base de données clients.
	 * 
	 * @param Long id, String telephone
	 */
	public void modifierNomClient(Long id, String nom);
	
	/**
	 * Méthode appelant la suppression d'un client dans la base de données clients.
	 * 
	 * @param Client c
	 */
	public void supprimerClient(Client c);


}