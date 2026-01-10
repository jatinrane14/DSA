import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> intersection(int arr1[], int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;

        int i =0;
        int j =0;

        ArrayList ls = new ArrayList<Integer>();

        while (i<n1 && j<n2) {
            if (arr1[i]<arr2[j]) {
                i++;
            }else if(arr2[j]<arr1[i]){
                j++;
            }else{
                ls.add(arr1[i]);
                i++;
                j++;
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
