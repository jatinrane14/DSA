import java.util.Arrays;

public class Solution {
    public static Boolean checkDuplicate(int[] arr){
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] == arr[i]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,4,1};
        Boolean res  = checkDuplicate(arr);
        System.out.println(res);
    }
}
