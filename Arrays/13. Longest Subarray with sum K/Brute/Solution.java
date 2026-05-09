public class Solution {
    public static int getSubarraySum(int arr[],int target){
        int maxSize= 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = i; k < arr.length; k++) {
                int sum=0;
                for (int k2 = i; k2 <=k; k2++) {
                    sum+=arr[k2];
                }
                if(sum==target){
                    maxSize = Math.max(maxSize,k-i+1);

                }
            }
        }
        return maxSize;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1,4,2,3};
        System.out.println(getSubarraySum(arr, 5));
    }    
}
