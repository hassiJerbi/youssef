package et3.java.projet.models;

import java.util.Date;

public class CD extends Document{
    public CD(String ean, String titre, String publisher, Date date, String auteurPrenom, String auteurNom, int quantiteDisponible, Serie serieDetails) {
        super(ean, titre, publisher, date, auteurPrenom, auteurNom, quantiteDisponible, serieDetails);
    }
}
