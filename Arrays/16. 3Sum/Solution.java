import java.util.*;
public class Solution {
    public static List<List<Integer>> threeSum(int[] nums){
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();    
        for(int i =0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> temp = new  ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }   
        res.addAll(st); 
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = threeSum(arr);
        System.out.print("[");
        for(int i=0;i<res.size();i++){
            System.out.print("[");
            for (int j = 0; j <3; j++) {
                System.out.print(res.get(i).get(j)+" ");
            }
            System.out.print("]");
        }
        System.out.print("]");
    }
}
