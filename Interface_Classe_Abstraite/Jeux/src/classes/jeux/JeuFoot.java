package classes.jeux;

import classes.Jeu;
import classes.PartieCoop;

public class JeuFoot extends Jeu implements PartieCoop {
    @Override
    public void jouer() {
        System.out.println("Jeu de foot commence");
    }

    @Override
    public void formationEquipe(int nbrPlayers) {
        System.out.println("Coequipiers trouvés");
    }

    @Override
    public void classement(int players) {
        System.out.println("Classement");
    }
}
