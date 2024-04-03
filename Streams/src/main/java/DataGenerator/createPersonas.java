package DataGenerator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class createPersonas {
    public static void main(String[] args) {

        String [][] nombres= {{"Francisco","Estrada"},{"Rocio", "Pascual"},{"Martin", "ariza"}, {"Emma", "Woida"}, {"Ludmila", "Dosil"}};
        // matriz de 2x5
        Persona [] personas = new Persona[nombres.length * nombres[0].length];
        int i=0,j=0; StringBuffer dni = new StringBuffer();
        dni.append("441777429"); // areglar  datos

       for(int k=0;k< personas.length;k++){
            i= (int)(Math.random()* nombres.length);
            j=(int)(Math.random()* nombres[0].length);
            dni.deleteCharAt(dni.length()-1);
           dni.append(Integer.toString(i));
            personas[k] = new Persona(nombres[i][0], nombres[i][j],dni.toString());
        }
        File f= new File("personas.txt");
        try {
            FileWriter escritura = new FileWriter(f);
            for(Persona p: personas){
                escritura.write(p.toString());
            }
            escritura.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
