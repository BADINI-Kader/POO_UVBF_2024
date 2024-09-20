package classe;

public class User {

    private final int id;

    private String nom;

    private String email;

    public User(int id, String nom, String email){
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    public String getNom(){
        return nom;
    }

    public String getEmail(){
        return email;
    }

    public int getId(){
        return id;
    }

    public void afficher(){
        System.out.println("ID : " + id + " - Nom : " + nom + " - Email : " + email);
    }
}
