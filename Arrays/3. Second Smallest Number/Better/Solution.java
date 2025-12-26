public class Solution {
    public static int findSmallest(int[] arr){
        int smallest = arr[0];
        int sSmallest =Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<smallest){
                sSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i]<sSmallest && arr[i] != smallest){
                sSmallest = arr[i];
            }
        }
        return sSmallest;
    }
    public static void main(String[] args) {
        int arr[] = {1,6,3,4,5,2};
        System.out.println(findSmallest(arr));
    }
}
