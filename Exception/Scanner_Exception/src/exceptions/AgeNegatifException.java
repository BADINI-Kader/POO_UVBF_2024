package exceptions;

public class AgeNegatifException extends Exception{

    public AgeNegatifException(){
        super("L'age ne peut pas être négatif");
    }

}
