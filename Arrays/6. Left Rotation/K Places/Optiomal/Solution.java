import java.util.Arrays;

public class Solution {
    public static void reverse(int[] arr, int start, int end){
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--; 
        }
    }
    public static void rotateLeft(int arr[],int n,int k ){
        if (k==0||n==0) return;
        k = k%n;

        reverse(arr, 0, n-1);

        reverse(arr, n-k, n-1);

        reverse(arr, 0, n-k-1);
    }

    public static void rotateRight(int arr[] , int n,int k ){
        if (k==0||n==0) return;

        k = k%n;
        reverse(arr, 0, n-1);

        reverse(arr, 0, k-1);

        reverse(arr, k, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        rotateRight(arr, n,6);
        System.out.println(Arrays.toString(arr));
    }
}


// 1 2 3 4 5 6
// 6 5 4 3 2 1