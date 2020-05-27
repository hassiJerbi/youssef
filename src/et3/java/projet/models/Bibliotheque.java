package et3.java.projet.models;

public class Bibliotheque {
	private String nom;
	
	public Bibliotheque(String nom) {
		this.nom = nom;
	}
	
	public boolean setNom(String nom) {
		this.nom = nom;
		return true;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public boolean ajouterDocument(Document doc) {
		//TO DO
		return true;
	}
	
	public boolean ajouterUtilisateur(String nom, Bibliotheque bib) {
		//TO DO
		return true;
	}
	
	public boolean emprunterDocument(Utilisateur utilisateur, Document document) {
		//TO DO
		return true;
	}
	
	public boolean rendreDocument(Utilisateur utilisateur, Document doc) {
		//TO DO
		return true;
	}
}
