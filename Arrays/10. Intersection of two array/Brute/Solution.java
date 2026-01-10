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
