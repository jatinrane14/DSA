import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static int appearOnes(int arr[]){

        Map<Integer,Integer> hashMp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hashMp.put(arr[i], hashMp.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hashMp.entrySet()) {
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5};
        System.out.println(appearOnes(arr));
    }    
}
