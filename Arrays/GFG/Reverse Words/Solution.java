public class Solution {
    public static String reverseWord(String str){
        StringBuilder res = new StringBuilder();
        String[] words = str.split("\\.");
        for (int i = words.length-1; i >=0; i--) {
            if(words[i].isEmpty()){
                continue;
            }
            if(res.length()>0){
                res.append(".");
            }
            res.append(words[i]);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str = "word.hrello";
        System.out.println(reverseWord(str));
    }    
}
