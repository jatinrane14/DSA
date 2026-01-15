import java.util.Arrays;

public class Solution {
   public static int appearOnes(int arr[]){
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
        max = Math.max(max, arr[i]);
    }

    int[] hash = new int[max+1];
    for (int i = 0; i < arr.length; i++) {
        hash[arr[i]]++;
    }
    System.out.println(Arrays.toString(hash));
    for (int i = 1; i < arr.length; i++) {
        if (hash[arr[i]]==1) {
            return arr[i];
        }
    }
    return -1;
   }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,4,5,5};
        System.out.println(appearOnes(arr));
    }    
}
