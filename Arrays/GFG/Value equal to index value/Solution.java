import java.util.List;
import java.util.ArrayList;
class Solution {
    
    public static List<Integer> valueEqualToIndex(List<Integer> nums) {
        // code here\
        List<Integer> ls = new ArrayList<>();
        int i =1 ;
        for(Integer elem : nums){
            if(elem == i){
                ls.add(i);
            }
            i++;
        }
        return ls;
    }
    public static void main(String[] args) {
        List<Integer> nums = List.of(15, 2, 45,4,7);
        System.out.println(valueEqualToIndex(nums));
    }
}