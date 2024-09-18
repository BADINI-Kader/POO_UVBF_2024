package perso;

public class Sorcier extends Perso{

    private int mana;

    private int degatMagique;

    public Sorcier(int mana, int dm, int pv, int def) {
        super(pv, def);
        this.mana = mana;
        this.degatMagique = dm;
    }

    public int getMana(){
        return mana;
    }

    public int getDegatMagique(){
        return degatMagique;
    }

    public void setMana(int mana){
        this.mana = mana;
    }

    public void setDegatMagique(int dm){
        this.degatMagique = dm;
    }

    public void attaquer(Perso cible){
        System.out.println("Vous avez attaquer");
        cible.encaisserDegat(degatMagique);
    }
}
