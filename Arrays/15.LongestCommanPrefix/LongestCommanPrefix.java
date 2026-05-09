import java.util.Arrays;

public class LongestCommanPrefix {
    public static String solution(String[] str){
        StringBuilder ans = new StringBuilder();
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length-1];
        for(int i =0;i<first.length();i++){
            if (first.charAt(i)!=last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(solution(str));
    }
}
