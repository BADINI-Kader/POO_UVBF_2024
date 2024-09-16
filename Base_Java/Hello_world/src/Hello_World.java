import java.util.Scanner;

public class Hello_World {

    public static void main(String[] args) {
        int nombre1 = 4;
        int nombre2 = 4;
        //System.out.println(!(nombre1 == 3 || nombre2 == 4));

        // Structure Conditionnel : If-else
        if (nombre1 > nombre2){
            System.out.println("Nombre1 est plus grand");
        }
        else if(nombre1 == nombre2){
            System.out.println("Les 2 nombres sont égaux");
        }
        else {
            System.out.println("Nombre2 est plus grand");
        }

        //Structure de controle : Switch
        int jour = 0;
        switch (jour){
            case 0:
                System.out.println("On est au jour 0");
                break;
            case 1:
                System.out.println("On est au jour 1");
                break;
            default:
                System.out.println("RAS");
                break;
        }

        // Boucle for
        for(int i = 0; i < 5; i++){
            System.out.println("Count " + i);
        }

        //Boucle while
        int myNombre = 0;
        while(myNombre != 5){
            System.out.println("Nombre inferieur à 5");
            myNombre += 1;
        }

        //Scanner
        /**
         * Commentaires
         * Multilignes
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Votre age s'il vous plait : ");
        int age = sc.nextInt();
        System.out.print("Votre nom s'il vous plait : ");
        sc.nextLine();
        String nom = sc.nextLine();
        System.out.println("Salut " + nom + ". Vous avez " + age + " ans.");

        //Recuperation de plusieurs lignes
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Saisir votre text : ");
        String text = sc1.nextLine();
        String monTextComplet = "";
        while(text != ""){
            monTextComplet += text + "\n";
            text = sc1.nextLine();
        }
        System.out.println("Mon text est ' \" : \n" + monTextComplet);

    }

}
