import perso.Guerrier;
import perso.Perso;
import perso.Sorcier;

public class RPG {

    public static void main (String[] args){
        Guerrier moussa = new Guerrier(13, 5, 10);
        Perso valkyrie = new Guerrier(17, 10, 20);
        Sorcier wizard = new Sorcier(20, 20, 5, 10);

        System.out.println("Moussa : ");
        moussa.afficher();

        System.out.println("Valkirie : ");
        valkyrie.afficher();

        System.out.println("Wizard : ");
        wizard.afficher();

        moussa.attaquer(valkyrie);
        moussa.attaquer(wizard);

        System.out.println("Moussa : ");
        moussa.afficher();

        System.out.println("Valkirie : ");
        valkyrie.afficher();

        System.out.println("Wizard : ");
        wizard.afficher();
    }

}
