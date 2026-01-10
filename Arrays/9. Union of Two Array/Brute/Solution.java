import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int[] union(int arr1[], int arr2[]){
        Set<Integer> st = new HashSet<>();

        for (int elem : arr1) {
            st.add(elem);
        }
        for (int elem : arr2) {
            st.add(elem);
        }
        int[] unionArr = new int[st.size()];
        int j =0; 
        for(Integer element : st) {
            unionArr[j] = element;
            j++;
        }
        return unionArr;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,4,6};
        int arr2[] = {1,3,3,5,7};
        int result[] = union(arr, arr2);

        System.out.println(Arrays.toString(result));
    }
}
