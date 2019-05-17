package org.banque.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Classe CB caractérisée par un numéro de carte, un plafond de retrait, un type
 * de carte et un attribut client. C'est une entité qui donnera une table dans
 * la base de donnée. Sa PK correspond au numero de carte, et elle est un
 * attribut de l'entité Client, prenant donc une FK client_id.
 * 
 * @author Marwa & Ihab
 *
 */
@Entity
@XmlRootElement(name = "cb")
@XmlAccessorType(XmlAccessType.FIELD)
public class CB {

	// Attributs
	@Id
	private long numeroCarte;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "client_id")
	@XmlTransient
	private Client client;

	private int plafondRetrait = 300;
	private String typeCarte;

	// Constructeur
	public CB(String typeCarte) {
		this.typeCarte = typeCarte;
	}

	public CB(long numeroCarte, Client c) {
		super();
		this.numeroCarte = numeroCarte;
		this.client = c;
	}

	public CB() {
		super();
	}

	// Getters et setters
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public long getNumeroCarte() {
		return numeroCarte;
	}

	public void setNumeroCarte(long numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	public int getPlafondRetrait() {
		return plafondRetrait;
	}

	public void setPlafondRetrait(int plafondRetrait) {
		this.plafondRetrait = plafondRetrait;
	}

	public String getTypeCarte() {
		return typeCarte;
	}

	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}

	@Override
	public String toString() {
		return "numéro carte : " + getNumeroCarte() + ", type de carte : " + getTypeCarte() + ", plafond : "
				+ getPlafondRetrait() + "€";
	}

}
