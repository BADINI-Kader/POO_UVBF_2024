package classe;

import java.util.HashMap;
import java.util.Map;

public class Biblio {

    // key 1 -> livre1
    // key 2 -> livre2
    private Map<Integer, Livre> livres;

    private Map<String, Livre> livresParTitre;

    public Biblio(){
        livres = new HashMap<>();
        livresParTitre = new HashMap<>();
    }

    public void ajouterLivre(Livre livre){
        livres.put(livre.getIsbn(), livre);
        livresParTitre.put(livre.getTitre(), livre);
    }

    public Livre rechercherLivreIsbn(int isbn){
        if(!livres.containsKey(isbn)){
            System.out.println("Livre inexistant : ISBN non valide");
            return null;
        }
        return livres.get(isbn);
    }

    public Livre rechercherLivreTitre(String titre){
        if(!livresParTitre.containsKey(titre)){
            System.out.println("Livre inexistant");
            return null;
        }
        return livresParTitre.get(titre);
    }

    public void suppressionLivre(int isbn){
        livres.remove(isbn);
    }

    public void afficherCatalogue(){
        for(int key : livres.keySet()){
            livres.get(key).afficher();
        }
    }

}
