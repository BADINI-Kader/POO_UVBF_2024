import classe.Personne;
import exceptions.AgeNegatifException;
import exceptions.NomVideException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner_Exception {

    public static void main(String[] args){

        boolean valid = true;
        Personne moi = new Personne();
        String nom = null;
        Scanner sc = new Scanner(System.in);

        do {
            try{
                // Saisie de nom
                if (nom == null){
                    System.out.print("Saisissez votre nom : ");
                    nom = sc.nextLine();
                    moi.setNom(nom);
                }

                //Saisie d'age
                sc = new Scanner(System.in);
                System.out.print("Saisissez votre age : ");
                int age = sc.nextInt();
                moi.setAge(age);

                moi.afficher();
                valid = true;

            } catch (InputMismatchException e){
                System.out.println("Vous n'avez pas saisie un nombre");
                valid = false;
            } catch (NomVideException e){
                System.out.println("Votre nom n'est pas valide");
                nom = null;
                valid = false;
            } catch (AgeNegatifException exception){
                System.out.println("Votre age n'est pas valid");
                valid = false;
            }

        } while(!valid);

        sc.close();

    }
}
