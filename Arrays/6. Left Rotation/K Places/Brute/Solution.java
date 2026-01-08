import java.util.Arrays;

public class Solution {
    public static void rotateRight(int arr[], int k){
        int n = arr.length;
        if (n==0) return;

        k=k%n;

        int[] temp =  new int[k];
        int in =0;
        for (int i = n-k; i <n; i++) {
            temp[in] = arr[i];
            in++;
        }
        for (int i = n-k-1; i >=0; i--) {
            arr[i+k] = arr[i];
        }

        for(int i =0;i<k;i++){
            arr[i] = temp[i];
        }
    }
    public static void rotateKLeft(int[] arr,int k){
        int n = arr.length;
        if (n==0) {
            return;
        }
        k = k%n;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i]; 
        }

        for (int i = k; i < n; i++) {
            arr[i-k] = arr[i];
        }
        int j=0;
        for (int i = n-k; i < n; i++) {
            arr[i] = temp[j];
            j++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        // rotateKLeft(arr, 3);
        rotateRight(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}

// k = 2
// 1,2,3,4,5