import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> intersection(int a[], int b[]){
        ArrayList ls = new ArrayList<>();
        int[] vis = new int[b.length];
        for(int i=0;i<a.length;i++){
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j] && vis[j]==0){
                    ls.add(a[i]);
                    vis[j] =1;
                    break;
                }
                // Array in sorted form if element j in 2nd array is grator elemet in 1st array at i than we sure the remaining portion of 2nd array will not contain element which is equal to i element in 1st array
                if(b[j]>a[i]){
                    break;
                }
            }
        }
        return ls;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,2,3,3,4,5,6};
        int arr2[] = {2,3,3,5,6,6,7};
        System.out.println(intersection(arr1, arr2));
    }
}
