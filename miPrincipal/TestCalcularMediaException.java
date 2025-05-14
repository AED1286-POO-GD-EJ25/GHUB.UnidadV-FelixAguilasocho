package miPrincipal;

import javax.print.attribute.standard.Media;

public class TestCalcularMediaException {
     public static void main(String[] args) throws MediaException {
        System.out.println("La media es:"+calcularMedia(8));
        
    }
    public static double calcularMedia(int num) throws MediaException {
        double c[]={1.2,2.2,3.3,4.4,5.5,6.6,7.7};
        double media;
        try{
            media = avg(c,num);
            return media;
        }catch(MediaException ex){
            System.out.println("Excepcion capturada "+ ex);
            System.out.println("El contenido del arreglo es menor al numero de los que querias sacar promedio");
            num=c.length;
            return avg(c, num);
        }
            
    }
    public static double avg(double []b,int num) throws MediaException {
        
        if(num>b.length){
            throw new MediaException("Excepcion en average");
        }
       
        double media =0;
        for(int i=0;i<num;i++){
            media = media + b[i];
        }
        return media/num;
    }
    
}