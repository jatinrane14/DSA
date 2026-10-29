import java.util.*;

public class Foursum {
    public static List<List<Integer>> solveFourSumBrute(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        int sum = nums[i] + nums[j] + nums[k] + nums[l];
                        if (sum == target) {
                            List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                            Collections.sort(temp);
                            st.add(temp);
                        }
                    }
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        res.addAll(st);
        return res;
    }
    public static List<List<Integer>> solveFourSumBetter(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Integer> mid = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                        long numL =(long) target - nums[i] - nums[j] - nums[k];
                        if(mid.contains((int)numL)){
                            List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k],(int)numL));
                            Collections.sort(temp);
                            st.add(temp);
                        }
                        mid.add(nums[k]);
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        res.addAll(st);
        return res;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,0,-1,0,-2,2};
        List<List<Integer>> res = solveFourSumBetter(arr, 0);

        for (int i =0;i<res.size();i++) {
            System.out.print("[");
            for(int j=0;j<res.get(i).size();j++){
                System.out.print(res.get(i).get(j) +" ");
            }
            System.out.print("]");
        }
    }
}