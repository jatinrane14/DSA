class Solution {
    public static int maximizeExpressionOfThree(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int sLargest=0;
        int min=Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>largest){
                sLargest = largest;
                largest = nums[i];
            }else if(nums[i]>sLargest && nums[i]<=largest){
                sLargest = nums[i];
            }
            if(nums[i]<min){
                min = nums[i];
            }
        }

        System.out.println(largest+" "+sLargest+" "+ min);
        return (largest+sLargest)-min;  

    }
    public static void main(String[] args) {
        int[] arr = {-8,-8,-8};
        System.out.println(maximizeExpressionOfThree(arr));
    }
}