package perso;

public class Guerrier extends Perso{

    private int degatPhysique;

    public Guerrier(int degPhys, int pv, int def){
        //initialisation des attributs de Perso
        super(pv, def);
        degatPhysique = degPhys;
    }

    public Guerrier(int degPhys, int pv){
        //initialisation des attributs de Perso
        super(pv);
        degatPhysique = degPhys;
    }

    public void attaquer(Perso cible){
        System.out.println("Vous avez attaquer");
        cible.encaisserDegat(degatPhysique);
    }

    public void afficher(){
        // Appel de la fonction afficher de la classe Perso
        super.afficher();
        System.out.println("Degat Physique : " + degatPhysique);
    }
}
