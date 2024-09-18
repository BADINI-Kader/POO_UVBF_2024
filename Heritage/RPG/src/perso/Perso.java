package perso;

public class Perso {

    protected int pointVie;

    protected int defense;

    protected boolean enVie;

    public Perso(){

    }

    public Perso(int pv, int def) {
        pointVie = pv;
        defense = def;
        enVie = true;
    }

    public Perso(int pv) {
        pointVie = pv;
        enVie = true;
    }

    public int getPointVie(){
        return pointVie;
    }

    public int getDefense(){
        return defense;
    }

    public boolean getEnVie(){
        return enVie;
    }

    public void setPointVie(int pv){
        if (pointVie == 0){
            enVie = false;
        }
        pointVie = pv;
    }

    public void setDefense(int def){
        defense = def;
    }

    public void bouger(){
        System.out.println("Vous avez bougé");
    }

    public void encaisserDegat(int degat){
        if(degat < defense){
            System.out.println("Pas de dégat");
        } else {
            pointVie = pointVie - (degat - defense);
        }
    }

    public void afficher(){
        System.out.println("PV : " + pointVie + " - Defense : " + defense + " - enVie : " + enVie);
    }
}
