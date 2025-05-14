package miPrincipal;

public class TestExceptionPersonalizada{
    public static void main(String[] args) {
        try{
            lanzarMiExcepcion();
        }catch(MiExceptionPersonalizada ex){
            System.out.println("Mi excepcion personalizada capturada" + ex.getMessage());
        }
    }
    public static void lanzarMiExcepcion() throws MiExceptionPersonalizada{
        throw new MiExceptionPersonalizada("Este es un mensaje de excepcion personalizada ");
    }
}