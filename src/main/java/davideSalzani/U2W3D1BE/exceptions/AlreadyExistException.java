package davideSalzani.U2W3D1BE.exceptions;

public class AlreadyExistException extends RuntimeException{
    public AlreadyExistException(String whichProperty){
        super(whichProperty + " già presente a database!");
    }
}
