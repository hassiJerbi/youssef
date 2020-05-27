package et3.java.projet.models;

import java.util.Date;

public abstract class Document {
    protected String ean;
    public String titre;
    protected String publisher;
    protected Date date;
    protected String auteurPrenom;
    protected String auteurNom;
    protected int quantiteDisponible;
    protected Serie serieDetails;

    public Document(String ean, String titre, String publisher, Date date, String auteurPrenom, String auteurNom, int quantiteDisponible, Serie serieDetails) {
        this.ean = ean;
        this.titre = titre;
        this.publisher = publisher;
        this.date = date;
        this.auteurPrenom = auteurPrenom;
        this.auteurNom = auteurNom;
        this.quantiteDisponible = quantiteDisponible;
        this.serieDetails = serieDetails;
    }
}
