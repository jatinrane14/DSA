public class Bubblesort {
    public static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sort(int arr[]){
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j <= i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,5,3,7,4,2};
        System.out.println("Before Swapping: ");
        for (int i : nums) {
            System.out.print(i);
        }
        sort(nums);
        System.out.println("\nAfter Swapping: ");
        for (int i : nums) {
            System.out.print(i);
        }
    }   
}
