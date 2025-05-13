package miPrincipal;

import java.io.FileInputStream;
import java.util.Properties;

public class Aplicacion{
    public Usuario login (String usrname, String password){
        try{
            //abrimos el archivo de propiedades para lectura
            FileInputStream fis = new FileInputStream("usuario.properties");

            //cargamos el archivo de propiedades
            Properties p = new Properties();
            p.load(fis);

            //leemos el valor de la propiedad usrname
            String usr = p.getProperty("usrname");

            //leermos el valor de la propiedad password
            String pwd = p.getProperty("password");

            //definimos la variable de retorno

            Usuario u = null;

            //si coninsiden los datos proporcionamos con los datos leidos
            if(usr.equals(usrname) && pwd.equals(password)){
                //instanciamos y "seteamos " todos los datos
                u = new Usuario();
                u.setUserName(usr);
                u.setPassword(pwd);
                u.setNombre(p.getProperty("nombre"));
                u.setEmail(p.getProperty("email"));
            }
            return u;
    
        }catch(Exception ex){
            //cualquier error, salgo por aqui
            throw new RuntimeException("Error verificando datos",ex);
        }
    }
  
    
}