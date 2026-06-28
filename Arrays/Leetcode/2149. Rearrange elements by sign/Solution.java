public class Solution{
    public static void rearrangeElemBySign(int[] arr){
        int n = arr.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int p=0;
        int ne =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos[p] = arr[i];
                p++;
            }else{
                neg[ne] = arr[i];
                ne++;
            }
        }
        ne=0;p=0;
        for (int i = 0; i < n; i++) {
            if(i%2 == 0){
                arr[i] = pos[p];
                p++;
            }else{
                arr[i] = neg[ne];
                ne++;
            }
        }
    } 
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
        System.out.println("Before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        rearrangeElemBySign(arr);
        System.out.println("After: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
} 