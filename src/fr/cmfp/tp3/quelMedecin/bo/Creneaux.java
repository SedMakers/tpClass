package fr.cmfp.tp3.quelMedecin.bo;

import java.time.LocalDate;

public class Creneaux {
	private LocalDate heureDebut;
	private int minutesMatin = 15;
	private int minutesAprem = 30;
	private MedecinGeneraliste medecin;
	public LocalDate getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(LocalDate heureDebut) {
		this.heureDebut = heureDebut;
	}
	public int getMinutesMatin() {
		return minutesMatin;
	}
	public void setMinutesMatin(int minutesMatin) {
		this.minutesMatin = minutesMatin;
	}
	public int getMinutesAprem() {
		return minutesAprem;
	}
	public void setMinutesAprem(int minutesAprem) {
		this.minutesAprem = minutesAprem;
	}
	public MedecinGeneraliste getMedecin() {
		return medecin;
	}
	public void setMedecin(MedecinGeneraliste medecin) {
		this.medecin = medecin;
	}
	
	public Creneaux(LocalDate heureDebut, int minutesMatin, int minutesAprem, MedecinGeneraliste medecin) {
		super();
		this.heureDebut = heureDebut;
		this.minutesMatin = minutesMatin;
		this.minutesAprem = minutesAprem;
		this.medecin = medecin;
	}
	
	public void afficher() {
		System.out.println( "Creneaux [heureDebut=" + heureDebut + ", minutesMatin=" + minutesMatin + ", minutesAprem="
				+ minutesAprem + ", medecin=" + medecin + "]");
	}
	
	
	
	
}

