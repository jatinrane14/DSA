import java.util.Arrays;

public class Solution{
    public static void rotate(int arr[]){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println("Before Rotating by one place");
        System.out.println(Arrays.toString(arr));
        rotate(arr);
        System.out.println("After Rotating by one place");
        System.out.println(Arrays.toString(arr));
    }
}

// T.C. = O(n)
// S.C. = O(1)