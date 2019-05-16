package org.banque.entity;


import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * Classe CompteCourant caractérisée par une autorisation de découvert et qui
 * hérite de la classe Compte. C'est une entité qui apparait directement dans la table 
 * Compte dans la base de données.
 * 
 * @author Marwa & Ihab
 *
 */
@Entity
@XmlRootElement(name = "compteco")
@XmlAccessorType(XmlAccessType.FIELD)
public class CompteCourant extends Compte {


	//	Attribut
	private int autorisationDecouvert = 1000;

//	Constructeur
	public CompteCourant(int solde, Long numeroCompte, String dateOuverture, Client c) {
		super(solde, numeroCompte, dateOuverture, c);
	}

	public CompteCourant(int solde, Long numeroCompte, String dateOuverture) {
		super(solde, numeroCompte, dateOuverture);
	}
	
	public CompteCourant() {
		super();
	}

	//	Getter et setter

	public int getAutorisationDecouvert() {
		return autorisationDecouvert;

	}

	public void setAutorisationDecouvert(int AutorisationDecouvert) {
		autorisationDecouvert = AutorisationDecouvert;
	}

	@Override
	public String toString() {
		return "numéro de compte : " + getNumeroCompte() + ", solde : " + getSolde() + "€" + ", date d'ouverture : "
				+ getDateOuverture();
	}
	@Override
	public Client getClient() {
		return super.getClient();
	}
	
	
	@Override
	public void setClient(Client client) {
		super.setClient(client);
	}

}
