import java.io.File;
import java.util.Scanner;
public class PruebaLectura {
    public static void main(String[]args){
        File fichero = new File("tm.txt");
        Scanner in = null;
        try{
            System.out.println("leemos...");
            in = new Scanner(fichero);
            // linea a linea leo
            while(in.hasNextLine()){
                String linea = in.nextLine(); //leo hasta espacio en blanco
                System.out.println(linea);
            }
        } catch (Exception ex){
            System.out.println("error en " + ex.getMessage());
        } finally{
            // sirve para ambos casos, sea que si como no
            try{
                if( in!=null)in.close();
            } catch(Exception ex2){
                System.out.println("error otra vez " + ex2.getMessage());
            }
        }
    }
}