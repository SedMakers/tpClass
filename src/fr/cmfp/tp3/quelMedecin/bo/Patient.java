package fr.cmfp.tp3.quelMedecin.bo;

import java.time.LocalDate;

public class Patient {
	private String nom;
	private String prenom;
	private String NumeroDeTelephone;
	private char sexe;
	private long numeroSecu;
	private LocalDate date;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getNumeroDeTelephone() {
		return NumeroDeTelephone;
	}
	public void setNumeroDeTelephone(String numeroDeTelephone) {
		NumeroDeTelephone = numeroDeTelephone;
	}
	
	public char getSexe() {
		return sexe;
	}
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	public long getNumeroSecu() {
		return numeroSecu;
	}
	public void setNumeroSecu(long numeroSecu) {
		this.numeroSecu = numeroSecu;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public void afficher() {
		System.out.println(this.nom + this.prenom + this.NumeroDeTelephone + this.sexe + this.numeroSecu + this.date);
	}
	public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numeroSecu, LocalDate date) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		NumeroDeTelephone = numeroDeTelephone;
		this.sexe = sexe;
		this.numeroSecu = numeroSecu;
		this.date = date;
	}
	
	
	
}
