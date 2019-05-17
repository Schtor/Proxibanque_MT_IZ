package org.banque.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe Entreprise caractérisée par numéro SIRET et qui hérite de la classe
 * Client. C'est une entité qui apparait directement dans la table Client dans
 * la base de données.
 * 
 * @author Marwa & Ihab
 *
 */

@Entity
@DiscriminatorValue("Entreprise")
@XmlRootElement(name = "entreprise")
@XmlAccessorType(XmlAccessType.FIELD)
public class Entreprise extends Client {

//	Constructeur

	public Entreprise(String nom, String adresse, Long codePostal, String ville, String telephone, Long numeroSIRET) {
		super(nom, adresse, codePostal, ville, telephone);
	}

	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getter et setter

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return super.getNom();
	}

	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		super.setNom(nom);
	}

	@Override
	public String getAdresse() {
		// TODO Auto-generated method stub
		return super.getAdresse();
	}

	@Override
	public void setAdresse(String adresse) {
		// TODO Auto-generated method stub
		super.setAdresse(adresse);
	}

	@Override
	public Long getCodePostal() {
		// TODO Auto-generated method stub
		return super.getCodePostal();
	}

	@Override
	public void setCodePostal(Long codePostal) {
		// TODO Auto-generated method stub
		super.setCodePostal(codePostal);
	}

	@Override
	public String getVille() {
		// TODO Auto-generated method stub
		return super.getVille();
	}

	@Override
	public void setVille(String ville) {
		// TODO Auto-generated method stub
		super.setVille(ville);
	}

	@Override
	public String getTelephone() {
		// TODO Auto-generated method stub
		return super.getTelephone();
	}

	@Override
	public void setTelephone(String telephone) {
		// TODO Auto-generated method stub
		super.setTelephone(telephone);
	}

	@Override
	public CompteCourant getCompteco() {
		// TODO Auto-generated method stub
		return super.getCompteco();
	}

	@Override
	public void setCompteco(CompteCourant compteco) {
		// TODO Auto-generated method stub
		super.setCompteco(compteco);
	}

	@Override
	public CompteEpargne getCompteE() {
		// TODO Auto-generated method stub
		return super.getCompteE();
	}

	@Override
	public void setCompteE(CompteEpargne compteE) {
		// TODO Auto-generated method stub
		super.setCompteE(compteE);
	}

	@Override
	public CB getCb() {
		// TODO Auto-generated method stub
		return super.getCb();
	}

	@Override
	public void setCb(CB cb) {
		// TODO Auto-generated method stub
		super.setCb(cb);
	}

	// TOSTRING
	@Override
	public String toString() {
		return "Entreprise [ toString()=" + super.toString() + "]";
	}

}
