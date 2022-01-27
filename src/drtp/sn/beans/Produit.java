package drtp.sn.beans;

public class Produit {
	private int id;
	private String nom;
	private int prix;
	private int quantite;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Produit(int id, String nom, int prix, int quantite) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.quantite = quantite;
	}
	
	public Produit(String nom, int prix, int quantite) {
		this.nom = nom;
		this.prix = prix;
		this.quantite = quantite;
	}
	
	public Produit() {
		
	}

}
