public class Solution {
    public static int getOnesOccur(int arr[]){
        int XOR=0;

        for (int i = 0; i < arr.length; i++) {
            XOR^=arr[i];
        }
        return XOR;
    }
    public static void main(String[] args) {
         int arr[]= {1,1,2,2,3,4,4};
        System.out.println(getOnesOccur(arr));
    }    
}
