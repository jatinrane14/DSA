public class TotalDistanceCovered {
    public static int findTotalDistanceCovered(int mainTank, int additionalTank){
        if(mainTank<5){
            return mainTank*10;
        }
        int transfer = Math.min((mainTank-1)/4, additionalTank);
        return (mainTank+transfer) *10;
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int mainTank = 2, additionalTank = 2;
        System.out.println("Tital Distance Covered(km): "+findTotalDistanceCovered(mainTank,additionalTank));
        long endTime = System.currentTimeMillis();
        System.out.println("Execution Time: " + (endTime - startTime) + " ms");
    }
}
