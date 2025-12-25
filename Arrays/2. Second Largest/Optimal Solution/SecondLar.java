public class SecondLar {
    public static int secondLar(int[] arr){
        int lar = arr[0];
        int sLar = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lar) {
                sLar = lar;
                lar = arr[i]; 
            }else if(arr[i] > sLar && arr[i] != lar){
                sLar = arr[i];
            }
        }
        return sLar;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,2,7,4,8,12,10};
        System.out.println(secondLar(arr));
    }
}
