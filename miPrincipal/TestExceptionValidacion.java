package miPrincipal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExceptionValidacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor = leerEntero(entrada);
        int resultado = 5/valor;
        System.out.println(resultado);
       
            
        
    }

    public static int leerEntero(Scanner entrada){
        while(true){
            System.out.print("Introduce un valor diferente de cero:");
            try{
                int valor = entrada.nextInt();
                int resultado = 5/valor;
                System.out.println(resultado);
                break;
            }catch(ArithmeticException ex){
                System.out.println("Se generó una division por cero: "+ex.getMessage());
                entrada.nextLine();

            }catch(InputMismatchException ex){
                System.out.println("valor inválido: "+ex.getMessage());
                entrada.nextLine();

            }catch(Exception ex){
                System.out.println("Ocurrio un error inesperado..."+ex.getMessage());
            }
            
    }
        return 0;
}
}

    
