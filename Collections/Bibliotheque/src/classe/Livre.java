package classe;

public class Livre {

    private static int nbrLivreCree;

    private final int isbn;

    private String titre;

    private String auteur;

    private int anneePublication;

    public Livre(){
        isbn = nbrLivreCree;
        nbrLivreCree += 1;
    }

    public Livre(String titre, String auteur, int annee){
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = annee;
        isbn = nbrLivreCree;
        nbrLivreCree += 1;
    }

    public void afficher(){
        System.out.println("Reference Livre : " + isbn);
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + auteur);
        System.out.println("Annee publication : " + anneePublication);
        System.out.println("--------------------------------------------");
    }

    public int getIsbn(){
        return isbn;
    }

    public String getTitre(){
        return titre;
    }

    public String getAuteur(){
        return auteur;
    }

    public int getAnneePublication(){
        return anneePublication;
    }
}
