import java.util.Date;

public class Machine {

    public static int nbrMachineCree = 0;

    private int serialNum;

    private String nomMachine;

    private int etat;

    private Date dateMaintenance;

    //private Piece piece;

    // Constructeur par défaut
    public Machine (){
        this.serialNum = nbrMachineCree;
        nbrMachineCree += 1;
    }

    //Constructeur surchargé
    public Machine (String nom, int etat, Date date){
        this.nomMachine = nom;
        if(etat > 0 && etat < 5){
            this.etat = etat;
        } else {
            System.out.println("Valeur de l'état non valide");
        }
        this.dateMaintenance = date;
        this.serialNum = nbrMachineCree;
        nbrMachineCree += 1;
    }

    // Getters
    public int getSerialNum(){
        return serialNum; // ou return this.serialNum;
    }

    public String getNomMachine(){
        return nomMachine; // ou return this.nomMachine;
    }

    public int getEtat(){
        return etat;
    }

    public Date getDateMaintenance(){
        return dateMaintenance;
    }

    //Setter
    public void setNomMachine(String nom){
        nomMachine = nom;
    }

    /**
     * 1 - Fonctionnel
     * 2 - Besoin de maintenance
     * 3 - Besoin de remplacement
     * 4 - Etat critique
     * @param etat : Définit l'état de la machine
     */
    public void setEtat(int etat){
        if (etat > 0 && etat < 5){
            this.etat = etat;
        } else{
            System.out.println("Valeur de l'état non valide");
        }
    }

    public void setDateMaintenance(Date date){
        dateMaintenance = date;
    }

    // Autre fonction
    public void afficherMachine(){
        System.out.println("Machine : " + nomMachine + " - Etat : " + etat + " - Date de Maintenace - " + dateMaintenance);
    }

}
