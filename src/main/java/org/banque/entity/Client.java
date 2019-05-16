package org.banque.entity;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe Client caractérisée par un id, un nom, une adresse, un code postal,
 * une ville, un téléphone. On lui ajoute en attribut des objets Conseiller, un SetCompte qui comptient des 
 * CompteCourant et CompteEpargne, et un SetCB qui contient des objets CB. C'est une entité qui donnera une
 * table dans la base de donnée. Sa PK correspond à l'attribut Id, dont la valeur est générée automatiquement
 * et elle est un attribut de l'entité Conseiller, prenant donc une FK conseiller_id. C'est la classe mère de 
 * Particulier et Entreprise, qui apparaitront donc dans la table client dans la base de données.
 * 
 * @author Marwa & Ihab
 *
 */
@XmlRootElement(name = "client")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TypeClient", discriminatorType = DiscriminatorType.STRING)
public class Client {
	
//	Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="Numero_de_compte_courant", unique=true)
	private CompteCourant compteco=new CompteCourant();
	
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="Numero_de_compte_epargne", unique=true)
	private CompteEpargne compteE;

	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="numero_cb", unique=true)
	private CB cb;


	private String nom;
	private String prenom;
	private String adresse;
	private Long codePostal;
	private String ville;
	private String telephone;
	private Long numeroSIRET;

//	Constructeur
	public Client(String nom, String adresse, Long codePostal, String ville, String telephone) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
	}

	public Client() {
		super();
	}

//	Getters et setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Long getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(Long codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Long getNumeroSIRET() {
		return numeroSIRET;
	}

	public void setNumeroSIRET(Long numeroSIRET) {
		this.numeroSIRET = numeroSIRET;
	}

	public CompteCourant getCompteco() {
		return compteco;
	}

	public void setCompteco(CompteCourant compteco) {
		this.compteco = compteco;
	}

	public CompteEpargne getCompteE() {
		return compteE;
	}

	public void setCompteE(CompteEpargne compteE) {
		this.compteE = compteE;
	}

	public CB getCb() {
		return cb;
	}

	public void setCb(CB cb) {
		this.cb = cb;
	}
	
}
