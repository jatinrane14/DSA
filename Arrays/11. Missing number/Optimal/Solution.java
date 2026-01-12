public class Solution {
    public static int findMissing(int arr[]){
            int n = arr.length+1;
            int sum = n*(n+1)/2;

            int actuallSum = 0;
            for (int i : arr) {
                actuallSum+=i;
            }

            return sum-actuallSum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};
        System.out.println(findMissing(arr));
    }
}
