import java.util.Arrays;
public class Solution {
    public static int findSmallest(int[] arr, int n){
        Arrays.sort(arr);
        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i]!=smallest) {
                sSmallest = arr[i];
                break;
            }
        }
        return sSmallest;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,3,4,4};
        int n = arr.length;
        int result  = findSmallest(arr,n);
        System.out.println(result);
    }
}
