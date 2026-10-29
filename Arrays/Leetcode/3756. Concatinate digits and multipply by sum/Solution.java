class Solution {
    public static int[] sumAndMultiply(String s, int[][] queries) {
        int n =  queries.length;

        int[] res = new int[n];

        for(int i =0;i<n;i++){
            String temp = s.substring(queries[i][0],queries[i][1]+1);
            if(temp ==""){
                res[i] = 0;
                break;
            }
            int num = Integer.parseInt(temp);
            int place =1;
            int sum =0;
            int x = 0;
            while(num>0){
                int ld = num%10;
                System.out.print("ld: " + ld + " ");
                if(ld!=0){
                    x = ld*place+x;
                    System.out.print("x: " + x + " ");
                    place*=10;
                    sum+=ld;
                }
                num/=10;
            }
            System.out.println();
            
            res[i] = (sum*x);
            x=0;
            sum=0;
        }

        return res;
    }
    public static void main(String[] args) {
        String s = "10203004";
        int[][] prefixes = {{0,7},{1,3},{4,6}};
        int[] res = sumAndMultiply(s,prefixes);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}