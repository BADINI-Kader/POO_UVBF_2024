package classes;

public abstract class Jeu{

    protected int nbrJoueur;

    public abstract void jouer();

    public void trouverAdversaire(){
        System.out.println("Adversaire Trouvé");
    }
}
