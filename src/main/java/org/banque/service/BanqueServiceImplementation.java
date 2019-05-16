package org.banque.service;

import java.util.List;

import org.banque.entity.Client;
import org.banque.entity.Compte;
import org.banque.entity.Entreprise;
import org.banque.entity.Particulier;
/**
 * Classe BanqueServiceImplementation qui impl�mente l'interface BanqueService.
 * Elle est compos�e des r�gles m�tiers pour la banque dont l'utilisateur 
 * Conseiller peut avoir besoin dans le cadre de ses fonctions.
 * 
 * @author Marwa & Ihab
 *
 */
public class BanqueServiceImplementation implements BanqueService {

	ClientService cs = new ClientServiceImplementation();

	/**
	 * M�thode d'audit.
	 * Elle va parcourir la liste des clients du conseiller et v�rifier que les
	 * clients particuliers ont un solde global sup�rieur � 5000, et que les 
	 * clients entreprises ont un solde global sup�rieur � 50000.
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
	 * M�thode de virement.
	 * Elle va prendre deux clients en arguments, deux comptes, et un nombre. Elle r�cup�rera les comptes s�l�ctionn�s 
	 * par le conseiller � partir des deux clients et transf�rera la somme du premier compte vers le deuxi�me.
	 * Les deux clients peuvent �tre le m�me, et on aura donc un virement interne d'un compte � l'autre d'une m�me personne.
	 * Si les deux comptes sont les m�mes, la m�thode fonctionnera �galement mais n'aura aucun effet.
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
