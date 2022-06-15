package fr.cmfp.tp3.quelMedecin.bo;

public class Adresse {
	private String mentionsComplementaire;
	private String numeroDeVoie;
	private String codePostale;
	
	

	

	public Adresse(String mentionsComplementaire, String numeroDeVoie, String codePostale) {
		super();
		this.mentionsComplementaire = mentionsComplementaire;
		this.numeroDeVoie = numeroDeVoie;
		this.codePostale = codePostale;
	}

	
	
	public Adresse(String numeroDeVoie, String codePostale) {
		super();
		this.numeroDeVoie = numeroDeVoie;
		this.codePostale = codePostale;
	}



	public void afficher() {
		System.out.println(this.mentionsComplementaire + this.numeroDeVoie + this.codePostale);
	}
	
	
}
