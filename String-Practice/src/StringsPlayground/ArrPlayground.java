package StringsPlayground;

public class ArrPlayground {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0;i<arr.length;i++){
            arr[i]= i+1;
        }
        int [] nueva = new int[12];
        for(int i=0; i< arr.length;i++){
            nueva[i]= arr[i];
        }
        arr= null;
    }
}
