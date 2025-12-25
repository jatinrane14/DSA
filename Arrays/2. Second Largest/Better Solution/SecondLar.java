public class SecondLar {
    public static int findSecondLar(int[] arr){
        int lar = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lar) {
                lar = arr[i];
            }
        }
        int secondLar = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLar && arr[i] !=lar ) {
                secondLar = arr[i];
            }
        }
        return secondLar;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,3,10,1,12,12};
        System.out.println(findSecondLar(arr));
    }
}
