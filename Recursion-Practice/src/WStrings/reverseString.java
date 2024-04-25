package WStrings;
import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre = in.nextLine();
        System.out.println(reverse(nombre));






    }
    public static String reverse(String str){
        if(str.length() == 1){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
