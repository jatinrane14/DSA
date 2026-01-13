public class Solution2 {
    public static int findMissing(int arr[]){
        int XOR1=0;
        int XOR2 =0;
        for (int i =0;i<arr.length;i++) {
            XOR1 ^=arr[i];
            XOR2 ^=(i+1);
        }
        XOR1 ^= arr.length+1;
        return XOR1^XOR2;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6};
        System.out.println("Missing Number is: "+findMissing(arr));
    }
}
