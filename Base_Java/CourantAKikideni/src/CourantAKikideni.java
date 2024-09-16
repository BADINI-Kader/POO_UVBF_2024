import java.util.Scanner;

public class CourantAKikideni {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int consommation = -1;

        // Demander à l'utilisateur d'entrer une consommation, en cas de valeur négative redemandée
        while (consommation < 0) {
            System.out.print("Entrez la consommation en kWh de l'habitant : ");
            consommation = scanner.nextInt();
            if (consommation < 0) {
                System.out.println("Erreur : la consommation ne peut pas être négative. Veuillez réessayer.");
            }
        }

        // Calcul de la facture en fonction des paliers
        double montantFacture = 0.0;
        if (consommation <= 100) {
            montantFacture = consommation * 50;
        } else if (consommation <= 200) {
            montantFacture = 100 * 50 + (consommation - 100) * 65;
        } else {
            montantFacture = 100 * 50 + 100 * 65 + (consommation - 200) * 120;
        }

        System.out.println("La facture d'électricité de cet habitant est de : " + montantFacture + " FCFA");

    }
}
