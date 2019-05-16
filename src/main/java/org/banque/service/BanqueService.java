package org.banque.service;

import org.banque.entity.Compte;
/**
 * Interface Banqueservice est composée des règles métiers pour la Banque, 
 * dont l'utilisateur Conseiller peut avoir besoin dans le cadre de ses fonctions.
 * 
 * @author Marwa & Ihab
 *
 */
public interface BanqueService {

	/**
	 * Méthode appelant la méthode implémentée dans la classe de services pour lançer le processus d'audit.
	 * 
	 */
	public boolean auditer();
	
	/**
	 * Méthode appelant la méthode implémentée dans la classe de services pour effectuer des virements.
	 * 
	 * @param Client client1, Client client2, Compte compte1, Compte compte2, Long somme
	 */
	public boolean faireVirement(Compte compte1, Compte compte2, Long somme);
	
}
