package org.banque.service;

import java.util.List;

import org.banque.entity.Client;
import org.banque.entity.Compte;
import org.banque.entity.Entreprise;
import org.banque.entity.Particulier;
/**
 * Classe BanqueServiceImplementation qui implémente l'interface BanqueService.
 * Elle est composée des règles métiers pour la banque dont l'utilisateur 
 * Conseiller peut avoir besoin dans le cadre de ses fonctions.
 * 
 * @author Marwa & Ihab
 *
 */
public class BanqueServiceImplementation implements BanqueService {

	ClientService cs = new ClientServiceImplementation();

	/**
	 * Méthode d'audit.
	 * Elle va parcourir la liste des clients du conseiller et vérifier que les
	 * clients particuliers ont un solde global supérieur à 5000, et que les 
	 * clients entreprises ont un solde global supérieur à 50000.
	 * 
	 */
	@Override
	public boolean auditer() {
		boolean okAudit = true;
		List<Client> listeC = cs.trouverToutClient();
		for (Client client : listeC) {
			if (client instanceof Particulier) {
				if (client.getCompteE() != null) {
					if (client.getCompteco().getSolde() + client.getCompteE().getSolde() < -5000) {
						okAudit = false;
					}
				} else {
					if (client.getCompteco().getSolde() < -5000) {
						okAudit = false;
					}
				}
			}
			if (client instanceof Entreprise) {

				if (client.getCompteE() != null) {
					if (client.getCompteco().getSolde() + client.getCompteE().getSolde() < -50000) {
						okAudit = false;
					}
				} else {
					if (client.getCompteco().getSolde() < -50000) {
						okAudit = false;
					}
				}
			}
		}

		return okAudit;
	}
	/**
	 * Méthode de virement.
	 * Elle va prendre deux clients en arguments, deux comptes, et un nombre. Elle récupèrera les comptes séléctionnés 
	 * par le conseiller à partir des deux clients et transfèrera la somme du premier compte vers le deuxième.
	 * Les deux clients peuvent être le même, et on aura donc un virement interne d'un compte à l'autre d'une même personne.
	 * Si les deux comptes sont les mêmes, la méthode fonctionnera également mais n'aura aucun effet.
	 * 
	 * 
	 * @param Client client1, Client client2, Compte compte1, Compte compte2, Long somme
	 */
	@Override
	public boolean faireVirement(Client client1, Client client2, Compte compte1, Compte compte2, Long somme) {
		boolean okVirement = true;
		compte1 = client1.getCompteco();
		return okVirement;
	}

}
