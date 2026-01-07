public class Solution {
    public static String removeDuplicates(String str){
        String res = "" + str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!res.contains(String.valueOf(ch))){
                res+=ch;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "gff";
        String res  = removeDuplicates(str);
        System.out.println(res);
    }
}
