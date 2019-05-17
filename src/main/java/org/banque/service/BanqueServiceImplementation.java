package org.banque.service;

import java.util.List;

import org.banque.entity.Client;
import org.banque.entity.Compte;
import org.banque.entity.Entreprise;
import org.banque.entity.Particulier;
import org.banque.persistence.DAOCo;
import org.banque.persistence.DAOCompte;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Classe BanqueServiceImplementation qui implémente l'interface BanqueService.
 * Elle est composée des règles métiers pour la banque dont l'utilisateur
 * Conseiller peut avoir besoin dans le cadre de ses fonctions.
 * 
 * @author Marwa & Ihab
 *
 */
public class BanqueServiceImplementation implements BanqueService {

	private static final Logger LOGGER = LoggerFactory.getLogger(BanqueServiceImplementation.class);
	ClientService cs = new ClientServiceImplementation();
	DAOCo daoco = new DAOCompte();

	/**
	 * Méthode d'audit. Elle va parcourir la liste des clients du conseiller et
	 * vérifier que les clients particuliers ont un solde global supérieur à 5000,
	 * et que les clients entreprises ont un solde global supérieur à 50000.
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
						LOGGER.info("client : " + client + "audit refusé");
					}
				} else {
					if (client.getCompteco().getSolde() < -5000) {
						okAudit = false;
						LOGGER.info("client : " + client + "audit refusé");
					}
				}
			}
			if (client instanceof Entreprise) {

				if (client.getCompteE() != null) {
					if (client.getCompteco().getSolde() + client.getCompteE().getSolde() < -50000) {
						okAudit = false;
						LOGGER.info("client : " + client + "audit refusé");
					}
				} else {
					if (client.getCompteco().getSolde() < -50000) {
						okAudit = false;
						LOGGER.info("client : " + client + "audit refusé");
					}
				}
			}
		}

		return okAudit;
	}

	/**
	 * Méthode de virement. Elle va prendre deux clients en arguments, deux comptes,
	 * et un nombre. Elle récupèrera les comptes séléctionnés par le conseiller à
	 * partir des deux clients et transfèrera la somme du premier compte vers le
	 * deuxième. Les deux clients peuvent être le même, et on aura donc un virement
	 * interne d'un compte à l'autre d'une même personne. Si les deux comptes sont
	 * les mêmes, la méthode fonctionnera également mais n'aura aucun effet.
	 * 
	 * 
	 * @param Client client1, Client client2, Compte compte1, Compte compte2, Long
	 *               somme
	 */
	@Override
	public boolean faireVirement(Long num1, Long num2, Long somme) {
		boolean okVirement = true;
		Compte comptedeb = daoco.afficherCompteParNumero(num1);
		Compte comptecred = daoco.afficherCompteParNumero(num2);
		if (somme > 0) {

			if ((comptedeb.getSolde() - somme) < (-1000)) {
				LOGGER.info("virement refusé");
				okVirement = false;
			} else {
				LOGGER.info("virement effectué");
				comptedeb.setSolde(comptedeb.getSolde() - somme);
				comptecred.setSolde(comptecred.getSolde() + somme);
			}

		}
		return okVirement;
	}

	public DAOCo getDAOCompte() {
		return this.daoco;
	}

	public void setDAOCompte(DAOCompte daoco) {
		this.daoco = daoco;
	}

	public ClientService getClientService() {
		return this.cs;
	}

	public void getClientService(ClientService cs) {
		this.cs = cs;
	}

}
