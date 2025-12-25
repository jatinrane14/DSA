import java.util.Arrays;
public class SecondLar{
    public static int secondLar(int[] arr){
        Arrays.sort(arr);
        int larget = arr[arr.length -1];
        int SecondLar = -1;
        for (int i = arr.length - 2; i < arr.length; i--) {
            if (larget!=arr[i]) {
                SecondLar = arr[i];
                break;
            }
            
        }
        return SecondLar;
    }
    public static void main(String[] args) {
        int arr[] ={1,5,4,6,10,10,10};
        System.out.println(secondLar(arr));
    }
}