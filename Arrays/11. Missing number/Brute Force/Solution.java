public class Solution{
    public static int findMissing(int arr[]){
        for (int i = 1; i <=arr.length; i++) {
            Boolean flag =false;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    flag =true;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        System.out.println(findMissing(arr));   
    }
}