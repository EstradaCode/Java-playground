package Numbers;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(turnBinary(15));
    }
    public static String turnBinary(int num){
        if(num == 0){
            return "";
        }
        return  turnBinary(num/2) + num % 2;
    }
}
