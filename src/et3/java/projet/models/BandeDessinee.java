package et3.java.projet.models;

import java.util.Date;

public class BandeDessinee extends Livre{
    public BandeDessinee(String ean, String titre, String publisher, Date date, String auteurPrenom, String auteurNom, int quantiteDisponible, Serie serieDetails, String isbn) {
        super(ean, titre, publisher, date, auteurPrenom, auteurNom, quantiteDisponible, serieDetails, isbn);
    }
}
