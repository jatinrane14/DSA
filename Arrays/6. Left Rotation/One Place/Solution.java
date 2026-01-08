import java.util.Arrays;

public class Solution{
    public static void rotateRight(int arr[]){
        int n = arr.length;
        int temp = arr[n-1];
        for (int i = n-2; i >=0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] =temp;
    }
    public static void rotateLeft(int arr[]){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println("Before Left/Right Rotating by one place");
        System.out.println(Arrays.toString(arr));
        // rotateLeft(arr);
        rotateRight(arr);
        System.out.println("After Rotating by one place");
        System.out.println(Arrays.toString(arr));
    }
}

// T.C. = O(n)
// S.C. = O(1)