import java.io.FileWriter;

public class PruebaEscritura {
    public static void main (String[]args){
        String linea ="hola buenos dias";
        FileWriter archivo;
        try{
            archivo = new FileWriter("hola.txt");
            // una vez creada la referencia y el archivo
            archivo.write(linea);
            archivo.close();
        } catch(Exception ex){
            System.out.println(" error: " + ex.getMessage());
        }
    }
}
