public class Largestnum {
    public static int findLargest(int[] num){
        int Lar = num[0];
        for (int i = 0; i < num.length; i++) {
            if (Lar < num[i]) {
                Lar = num[i];
            }
        }
        return Lar;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,35,8,12};

        System.out.println(findLargest(arr));
    }
}
