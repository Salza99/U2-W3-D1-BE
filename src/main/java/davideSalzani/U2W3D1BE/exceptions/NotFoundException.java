package davideSalzani.U2W3D1BE.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String whichRecord){
        super(whichRecord + " non presente a database!");
    }
}
