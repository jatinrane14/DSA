import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static ArrayList<Integer> union(int arr1[] , int arr2[]){
        ArrayList<Integer> ls = new ArrayList<Integer>();
        int n1 = arr1.length;
        int n2 = arr1.length;
        int i =0;
        int j =0;
        while (i<n1 && j<n2) {
            if (arr1[i] <= arr2[j]) {
                if (ls.isEmpty()||arr1[i] != ls.getLast()) {
                    ls.add(arr1[i]);
                }
                i++;
            }else{
                if (ls.isEmpty()||arr2[j] != ls.getLast()) {
                    ls.add(arr2[j]);
                }
                j++;
            }
        }
        while(j<n2){
            if (ls.isEmpty()||arr2[j] != ls.getLast()) {
                ls.add(arr2[j]);
            }
            j++;
        }
        while(j<n2){
            if (ls.isEmpty()||arr1[i] != ls.getLast()) {
                ls.add(arr1[i]);
            }
            i++;
        }
        return ls;
    }
    public static void main(String[] args) {
        int arr1[] = {1,1,2,4,6};
        int arr2[] = {1,3,3,5,7};
        System.out.println(union(arr1, arr2));
    }
}
