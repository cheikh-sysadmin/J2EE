package drtp.sn.beans;

public class Auteur {
	private String nom;
	private String prenom;
	private Boolean actif;
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
	public Boolean getActif() {
		return actif;
	}
	public void setActif(Boolean actif) {
		this.actif = actif;
	}
	public Auteur(String nom, String prenom, Boolean actif) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.actif = actif;
	}
	
	public Auteur() {
		
	}
	@Override
	public String toString() {
		return "Auteur [nom=" + nom + ", prenom=" + prenom + ", actif=" + actif + "]";
	}
	
	
	

}
