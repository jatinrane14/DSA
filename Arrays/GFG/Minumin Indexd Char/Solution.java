public class Solution {
    public static int minIndexChar(String s1, String s2) {
        // code here
        int minPos = Integer.MAX_VALUE;
        boolean flag = false;
        for(int i =0;i<s2.length();i++){
            char c = s2.charAt(i);
            for(int j = 0;j<s1.length();j++){
                if(s1.charAt(j) == s2.charAt(i)){
                    minPos = Math.min(j,minPos);
                    flag = true;
                }
            }
        }
        
        return flag?minPos:-1;
    }
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "set";
        System.out.println(minIndexChar(s1, s2));
    }    
}
