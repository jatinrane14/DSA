public class OptimalSol {
    public static int[] rearrangeElemBySign(int[] arr) {
        int[] result = new int[arr.length];
        int even =0;
        int odd =1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                result[even] = arr[i];
                even+=2;
            }else{
                result[odd] = arr[i];
                odd+=2;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
        System.out.println("Before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] res = rearrangeElemBySign(arr);
        System.out.println("After: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
