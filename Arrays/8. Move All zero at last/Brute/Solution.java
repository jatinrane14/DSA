import java.util.Arrays;

public class Solution {
    public static void shiftZero(int arr[]){
        int n = arr.length;
        if(n==0) return;
        int[] temp = new int[n];
        int count =0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0) {
                temp[count] = arr[i];
                arr[i] =0;
                count++;
            }
        }
        for (int i = 0; i <count; i++) {
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr={1,0,2,3,0,5,0,6,0,0,7};
        System.out.println(Arrays.toString(arr));
        shiftZero(arr);
        System.out.println(Arrays.toString(arr));
    }
}
