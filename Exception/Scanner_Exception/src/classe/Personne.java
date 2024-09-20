package classe;

import exceptions.AgeNegatifException;
import exceptions.NomVideException;

public class Personne {

    private String nom;

    private int age;

    public Personne(String nom, int age){
        this.nom = nom;
        this.age = age;
    }

    public Personne(){}

    public int getAge(){
        return age;
    }

    public String getNom(){
        return nom;
    }

    /**
     * Enregistre le nom de la personne, retourne une exception si le nom est vide
     * @param nom : Nom de la personne
     */
    public void setNom(String nom) throws NomVideException {
        if(nom.isBlank()){
            throw new NomVideException();
        }
        this.nom = nom;
    }

    /**
     * Enregistre l'age de la personne, retourne une exception si l'age est negatif
     * @param age : L'age de la personne
     */
    public void setAge(int age) throws AgeNegatifException {
        if(age < 0){
            throw new AgeNegatifException();
        }
        this.age = age;
    }


    public void afficher(){
        System.out.println("Je m'appelle " + nom + " et j'ai " + age  + " ans");
    }
}
