public class OptimmalSolution {
    public static long sumAndMultiply(int n){
        if(n==0||n==1){
            return n;
        }
        int place=1;
        int sum=0;

        long newN = 0;
        while(n>0){
            int ld = n%10;
            if(ld!=0){
                sum+=ld;
                newN = ld*place+newN;
                System.out.println("New N"+newN);
                place *=10;
            }
            n/=10;
        }
        System.out.println(sum);
        return sum * newN;
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sumAndMultiply(n));
    }
}
