public class Solution {
    public static int removeDuplicates(int[] arr){
        int i =0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
         int arr[] = {1,1,2,3,4,4,5,6,6,7,7};

        int size = removeDuplicates(arr);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
