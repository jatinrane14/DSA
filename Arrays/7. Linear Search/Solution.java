public class Solution {
    public static int search(int  arr[],int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        int resIndex = search(arr, 2);
        if (resIndex!=-1) {
            System.out.println("Element is present at: "+ resIndex);
        }else{
            System.out.println("Element is not present in array!");
        }
    }
}
