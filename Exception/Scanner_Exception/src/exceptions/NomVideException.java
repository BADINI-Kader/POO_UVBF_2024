package exceptions;

public class NomVideException extends Exception{
    public NomVideException(){
        super("Le champs nom doit contenir au moins un caractère");
    }
}
