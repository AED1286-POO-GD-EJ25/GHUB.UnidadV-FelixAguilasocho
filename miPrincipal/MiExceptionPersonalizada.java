package miPrincipal;

public class MiExceptionPersonalizada extends Exception{
    private String mensaje;
    public MiExceptionPersonalizada(String mensaje){
        super(mensaje);
    }
}