import javax.crypto.Mac;
import java.util.Date;

public class GMAO_APP {

    public static void main(String[] args){
        System.out.println(Machine.nbrMachineCree);

        // Création d'un objet avec le constructeur surchargé
        Machine machine1 = new Machine("HP", 1, new Date());

        // Création d'un objet avec le constructeur par défaut
        Machine machine2 = new Machine();
        machine2.setNomMachine("Asus");
        machine2.setEtat(4);
        machine2.setDateMaintenance(new Date());

        machine1.afficherMachine();
        machine2.afficherMachine();

        //Création avec un état non valide
        Machine machine3 = new Machine("MSI", -1, new Date());
        machine3.afficherMachine();

        System.out.println("NumSerie Machine1 : " + machine1.getSerialNum());
        System.out.println("NumSerie Machine2 : " + machine2.getSerialNum());
        System.out.println("NumSerie Machine3 : " + machine3.getSerialNum());


    }

}
