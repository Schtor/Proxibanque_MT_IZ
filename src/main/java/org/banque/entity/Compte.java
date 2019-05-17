package org.banque.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Classe Compte caractérisée par un id, un numéro de compte, un solde et une
 * date d'ouverture. On lui ajoute en attribut des objets Client. C'est une
 * entité qui donnera une table dans la base de donnée. Sa PK correspond à
 * l'attribut Id, dont la valeur est générée automatiquementet elle est un
 * attribut de l'entité Client, prenant donc une FK client_id. C'est la classe
 * mère de CompteCourant et CompteEpargne, qui apparaitront donc dans la table
 * Compte dans la base de données.
 * 
 * @author Marwa & Ihab
 *
 */
@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte {

	// Attributs
	@Id
	private long numeroCompte;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "client_id")
	@XmlTransient
	private Client client;

	private double solde;
	private String dateOuverture;

	// Constructeur
	public Compte(int solde, Long numeroCompte, String dateOuverture, Client c) {
		this.solde = solde;
		this.numeroCompte = numeroCompte;
		this.dateOuverture = dateOuverture;
		this.client = c;
	}

	public Compte(int solde, Long numeroCompte, String dateOuverture) {
		this.solde = solde;
		this.numeroCompte = numeroCompte;
		this.dateOuverture = dateOuverture;
	}

	public Compte() {
		super();
	}

	// Getters et setters

	public long getNumeroCompte() {
		return numeroCompte;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setNumeroCompte(long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	/**
	 * Impossible d'attribuer un solde de compte dans le négatif
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

}
