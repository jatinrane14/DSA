import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static int removeDuplicates(int arr[]){
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            st.add(arr[i]);
        }
        int index =0;
        for (Integer it: st) {
            arr[index++] = it;
        }

        return index;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,4,5,6,6};

        int size = removeDuplicates(arr);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
