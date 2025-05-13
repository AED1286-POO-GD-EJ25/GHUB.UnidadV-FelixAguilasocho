package miPrincipal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un valor diferente de cero:");
        try{
            int valor = entrada.nextInt();
            int resultado = 5/valor;
            System.out.println(resultado);
        }catch(ArithmeticException ex){
            System.out.println("Se generó una division por cero: "+ex.getMessage());

        }catch(InputMismatchException ex){
            System.out.println("valor inválido: "+ex.getMessage());

        }catch(Exception ex){
            System.out.println("Ocurrio un error inesperado..."+ex.getMessage());
        }
        
        finally{
            entrada.close();
        }
    }

}