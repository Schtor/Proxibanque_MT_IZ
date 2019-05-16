package org.banque.service;

import java.util.List;

import org.banque.entity.Client;

/**
 * Interface ClientService est compos�e des r�gles m�tiers pour le client et
 * joue le r�le d'interm�diaire entre l'utilisateur et la base de donn�es des
 * clients.
 * 
 * @author Marwa & Ihab
 *
 */
public interface ClientService {

	/**
	 * M�thode appelant la sauvegarde d'un client dans la base de donn�es clients.
	 * 
	 * @param Client c
	 */
	public void ajouterClient(Client c);

	/**
	 * M�thode appelant la demande d'un client dans la base de donn�es clients.
	 * 
	 * @param Long id
	 */
	public Client trouverClient(Long id);

	/**
	 * M�thode appelant la demande de tous les client dans la base de donn�es
	 * clients.
	 * 
	 */
	public List<Client> trouverToutClient();

	/**
	 * M�thode appelant la modification de l'adresse d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param Long id, String adresse
	 */
	public void modifierAdresseClient(Long id, String adresse);

	/**
	 * M�thode appelant la modification du code postal d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param Long id, Long codePostal
	 */
	public void modifierCodePostalClient(Long id, Long codePostal);

	/**
	 * M�thode appelant la modification de la ville d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param Long id, String ville
	 */
	public void modifierVilleClient(Long id, String ville);

	/**
	 * M�thode appelant la modification du num�ro de t�l�phone d'un client dans la
	 * base de donn�es clients.
	 * 
	 * @param Long id, String telephone
	 */
	public void modifierTelephoneClient(Long id, String telephone);
	
	/**
	 * M�thode appelant la modification du nom d'un client dans la
	 * base de donn�es clients.
	 * 
	 * @param Long id, String telephone
	 */
	public void modifierNomClient(Long id, String nom);
	
	/**
	 * M�thode appelant la suppression d'un client dans la base de donn�es clients.
	 * 
	 * @param Client c
	 */
	public void supprimerClient(Client c);


}