public class Solution {
    private static int findValueNCR(int n,int r){
        int res = 1;
        for (int i = 0; i <r; i++) {
            res = res*(n-i);
            res = res / (i+1);
        }
        return res;
    }
    private static void printAnyRow(int n){
        int res = 1;
        System.out.print(res);
        for (int c = 1; c <=n; c++) {
            res *= (n-c);
            res /= c;
            System.out.print(res+" ");
        }
    }
    public static void main(String[] args) {
        int r =5,c = 3;
        System.out.println(findValueNCR(r-1, c-1));
        System.out.println("Print Any row");
        printAnyRow(5);
    }
}
