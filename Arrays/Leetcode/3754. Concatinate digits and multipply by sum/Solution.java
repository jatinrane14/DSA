class Solution {
    public static long sumAndMultiply(int n) {
        int temp = n;
        int sum=0;
        while(temp>0){
            int ls = temp%10;
            sum+=ls;
            temp/=10;
        }
        String numStr = Long.toString(n);
        StringBuilder resStr = new StringBuilder();
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) != '0') {
                resStr.append(numStr.charAt(i));
            }
        }
        long digits =  Long.parseLong(resStr.toString());
        return (long)(sum * digits);
    }
    public static void main(String[] args) {
        int n = 65463628;
        System.out.println(sumAndMultiply(n));
    }
}