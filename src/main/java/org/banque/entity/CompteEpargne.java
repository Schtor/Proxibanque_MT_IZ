package org.banque.entity;


import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe CompteEpargne caract�ris�e par un taux de r�mun�ration et qui
 * h�rite de la classe Compte. C'est une entit� qui apparait directement dans la table 
 * Compte dans la base de donn�es.
 * 
 * @author Marwa & Ihab
 *
 */
@Entity
@XmlRootElement(name = "compteep")
@XmlAccessorType(XmlAccessType.FIELD)
public class CompteEpargne extends Compte {

//	Attribut
	private int tauxRemuneration = 3;

//	Constructeur
	public CompteEpargne(int solde, Long numeroCompte, String dateOuverture, Client c) {
		super(solde, numeroCompte, dateOuverture, c);

	}

	public CompteEpargne() {
		super();
	}

	//	Getter et setter
	public int getTAUXREMUNERATION() {
		return tauxRemuneration;
	}

	public void setTAUXREMUNERATION(int TauxRemuneration) {
		tauxRemuneration = TauxRemuneration;
	}

	@Override
	public String toString() {
		return "num�ro de compte : " + getNumeroCompte() + ", �pargne : " + getSolde() + "�" + ", date d'ouverture : "
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
