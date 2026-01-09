import java.util.Arrays;
public class Solution {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b =temp;
    }
    public static void moveZeros(int arr[]){
        int j =-1 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        for (int i = j+1; i < arr.length; i++) {
            if(arr[i]!=0){  
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,0,2,3,0,5,0,6,0,0,7};
        System.out.println(Arrays.toString(arr));
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
