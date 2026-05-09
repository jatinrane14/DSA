public class Solution{
    public static int LongestSubarray(int arr[], int k){
        int longest = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == k){
                    longest = Math.max(j-i+1, longest);
                }
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,7};
        int k  = 6;
        System.out.println(LongestSubarray(arr,k));
    }
}