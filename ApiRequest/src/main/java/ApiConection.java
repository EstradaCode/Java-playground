import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class ApiConection {
    public static void main(String[] args) throws IOException{
        Scanner in1 = new Scanner(System.in);
        System.out.println("que serie quieres ver? ( poner - en espacios en blanco)");
        String show = in1.nextLine();
        in1.close();
        URL url = new URL("https://www.episodate.com/api/search?q=" + show + "&page=1");
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int respuesta =connection.getResponseCode();
        if( respuesta != 200){
                throw new RuntimeException("ocurrio error" + respuesta);
        }else{
            StringBuilder s = new StringBuilder();
            Scanner in = new Scanner(url.openStream());
            while(in.hasNext()){
                s.append(in.nextLine());
            }
            System.out.println(s);
            in.close();
        }
    }
}
