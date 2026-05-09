public class Solution {
    public static int LargetSubArrLen(int arr[], int k){
        int n = arr.length;
        int length=0;

        int left=0, right=0;

        int sum = arr[0];

        while (right<n) {
            if (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                length = Math.max(length, right-left+1);
            }
            right++;
            if (right<n) {
                sum+=arr[right];
            }
        }

        return length;
    }
    public static void main(String[] args) {
         int arr[] = {1,2,3,1,1,1,1,4,2,3};
        System.out.println(LargetSubArrLen(arr, 5));
    }
}
