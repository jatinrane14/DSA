public class Solution {
    public static int findMissing(int arr[]){
        int n = arr.length;
        int[] hashArr = new int[n+2];
        for (int i = 0; i < arr.length; i++) {
            hashArr[arr[i]] = 1;
        }
        for (int i = 1; i < hashArr.length; i++) {
            if (hashArr[i] !=1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6}; 
        System.out.println(findMissing(arr)); 
    }
}
