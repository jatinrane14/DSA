public class Selectionsort {
    public static void swap(int arr[],int i,int smallest){
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;
    }
    public static void sort(int arr[]){
        for(int i =0;i<=arr.length-2;i++){
            int smN = i;
            for(int j =i;j<=arr.length-1;j++){
                if(arr[j]<arr[smN]){
                    smN = j;
                }
            }
            swap(arr,i,smN);
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
