import classes.Jeu;
import classes.jeux.JeuBoxe;
import classes.jeux.JeuFoot;

public class Jeux {

    public static void main(String[] args){
        Jeu jeu1 = new JeuFoot();
        Jeu jeu2 = new JeuBoxe();

        jeu1.jouer();
        jeu2.jouer();
    }

}
