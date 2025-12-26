public class Solution {
    public static void solution(int arr[],int targetSum){
        int left =0;
        int currentSum =0 ;
        for(int right  = 0;right<arr.length;right++ ){
            currentSum+= arr[right];
            while(currentSum > targetSum && left <=right){
                currentSum-=arr[left];
                left++;
            }
            if(currentSum == targetSum){
                System.out.println((left+1) +" "+ (right+1));
                return;
            }
        }
    }
    public static void main(String args[]){
        int arr[] ={1,2,3,7,5};
        solution(arr,10);        
    }
}
