package et3.java.projet.models;

import java.util.Date;

public class JeuVideo extends Document{
    public JeuVideo(String ean, String titre, String publisher, Date date, String auteurPrenom, String auteurNom, int quantiteDisponible, Serie serieDetails) {
        super(ean, titre, publisher, date, auteurPrenom, auteurNom, quantiteDisponible, serieDetails);
    }
}
