package org.banque.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe Particulier caract�ris�e par un pr�nom et qui h�rite de la classe
 * Client. C'est une entit� qui apparait directement dans la table Compte dans
 * la base de donn�es.
 * 
 * @author Marwa & Ihab
 *
 */

@Entity
@DiscriminatorValue("Particulier")
@XmlRootElement(name = "particulier")
@XmlAccessorType(XmlAccessType.FIELD)
public class Particulier extends Client {

//	Constructeur

	public Particulier(String nom, String prenom, String adresse, Long codePostal, String ville, String telephone) {
		super(nom, adresse, codePostal, ville, telephone);

	}

	public Particulier() {
		super();
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
		return "Particulier [ toString()=" + super.toString() + "]";
	}

}
