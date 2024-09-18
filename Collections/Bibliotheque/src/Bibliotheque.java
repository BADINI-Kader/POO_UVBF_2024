import classe.Biblio;
import classe.Livre;

import java.util.Scanner;

public class Bibliotheque {

    public static void main(String[] args){
        Biblio biblio = new Biblio();

        //Ajout de Livre
        biblio.ajouterLivre(new Livre("L'enfant noir", "Camara Laye", 2003));
        biblio.ajouterLivre(new Livre("Ville Cruelle", "Eza Boto", 1954));
        biblio.ajouterLivre(new Livre("Germinal", "Emile Zola", 2008));

        biblio.afficherCatalogue();

        //Suppression de livre
        biblio.suppressionLivre(1);
        biblio.afficherCatalogue();

        //Recherche de livre par ISBN

        Scanner sc = new Scanner(System.in);
        System.out.print("Saisisser un isbn : ");
        int isbn = sc.nextInt();
        Livre livreRecherche = biblio.rechercherLivreIsbn(isbn);
        if(livreRecherche != null ){
            livreRecherche.afficher();
        }

        //Recherche livre par titre
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Saissiser le titre d'un livre : ");
        String titre = sc1.nextLine();
        Livre livre = biblio.rechercherLivreTitre(titre);
        if (livre != null) {
            livre.afficher();
        }
    }

}
