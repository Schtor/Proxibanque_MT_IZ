package org.banque.service;

import org.banque.entity.Compte;
/**
 * Interface Banqueservice est compos�e des r�gles m�tiers pour la Banque, 
 * dont l'utilisateur Conseiller peut avoir besoin dans le cadre de ses fonctions.
 * 
 * @author Marwa & Ihab
 *
 */
public interface BanqueService {

	/**
	 * M�thode appelant la m�thode impl�ment�e dans la classe de services pour lan�er le processus d'audit.
	 * 
	 */
	public boolean auditer();
	
	/**
	 * M�thode appelant la m�thode impl�ment�e dans la classe de services pour effectuer des virements.
	 * 
	 * @param Client client1, Client client2, Compte compte1, Compte compte2, Long somme
	 */
	public boolean faireVirement(Compte compte1, Compte compte2, Long somme);
	
}
