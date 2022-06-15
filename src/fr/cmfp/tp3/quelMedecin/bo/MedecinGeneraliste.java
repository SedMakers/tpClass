package fr.cmfp.tp3.quelMedecin.bo;

import java.time.LocalTime;
import java.util.Arrays;

public class MedecinGeneraliste {
	
	private String nom;
	private String prenom;
	private String NumeroDeTelephone;
	private static int tarif;
	
	private Adresse adresse;
	private Creneaux[] creneau = new Creneaux[15]; 
	
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
	public static int getTarif() {
		return tarif;
	}
	public static void setTarif(int tarif) {
		MedecinGeneraliste.tarif = tarif;
	}
	
	
	
	
	public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		NumeroDeTelephone = numeroDeTelephone;
		this.adresse = adresse;
	}
	

	

	public void afficher() {
		System.out.println( "MedecinGeneraliste [nom=" + nom + ", prenom=" + prenom + ", NumeroDeTelephone=" + NumeroDeTelephone
				+ ", adresse=" + adresse + ", creneaux=" + Arrays.toString(creneau) + "]");
	}
	public void afficherCreneau() {
		System.out.println( "MedecinGeneraliste [creneaux=" + Arrays.toString(creneau) + "]");
	}
	
	public void ajouterCreneau(LocalTime heureDeDebut, int duree) {
			int caseDuTableau = 0;
			  if(heureDeDebut.getHour() == 9 && heureDeDebut.getMinute() == 0) {
				  caseDuTableau = 0;
			  }else if (heureDeDebut.getHour() == 9 && heureDeDebut.getMinute() == 15){
				  caseDuTableau = 1;
			  }else if (heureDeDebut.getHour() == 9 && heureDeDebut.getMinute() == 30){
				  caseDuTableau = 2;
			  }else if (heureDeDebut.getHour() == 9 && heureDeDebut.getMinute() == 45){
				  caseDuTableau = 3;
			  }else if (heureDeDebut.getHour() == 10 && heureDeDebut.getMinute() == 30){
				  caseDuTableau = 4;
			  }else if (heureDeDebut.getHour() == 10 && heureDeDebut.getMinute() == 45){
				  caseDuTableau = 5;
			  }else if (heureDeDebut.getHour() == 11 && heureDeDebut.getMinute() == 15){
				  caseDuTableau = 6;
			  }else if (heureDeDebut.getHour() == 11 && heureDeDebut.getMinute() == 30){
				  caseDuTableau = 7;
			  }else if (heureDeDebut.getHour() == 11 && heureDeDebut.getMinute() == 45){
				  caseDuTableau = 8;
			  }else if (heureDeDebut.getHour() == 14 && heureDeDebut.getMinute() == 0){
				  caseDuTableau = 9;
			  }else if (heureDeDebut.getHour() == 14 && heureDeDebut.getMinute() == 30){
				  caseDuTableau = 10;
			  }else if (heureDeDebut.getHour() == 15 && heureDeDebut.getMinute() == 0){
				  caseDuTableau = 11;
			  }else if (heureDeDebut.getHour() == 15 && heureDeDebut.getMinute() == 30){
				  caseDuTableau = 12;
			  }else if (heureDeDebut.getHour() == 16 && heureDeDebut.getMinute() == 0){
				  caseDuTableau = 13;
			  }else if (heureDeDebut.getHour() == 16 && heureDeDebut.getMinute() == 30){
				  caseDuTableau = 14;
			  } 
			  
			  this.creneau[caseDuTableau] = new Creneaux(LocalTime heureDeDebut, int leTpsDuCreneau, )
				  
			  
		  
	}
	
	
	
	
	
}
