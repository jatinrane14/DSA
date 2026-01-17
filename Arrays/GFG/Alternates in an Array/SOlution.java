import java.util.ArrayList;
public class SOlution {
    public static ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> ls = new ArrayList<>();
        
        for(int i =0;i<arr.length;i++){
            if(i%2==0){
                ls.add(arr[i]);
            }
        }
        return ls;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        System.out.println(getAlternates(nums));
    }    
}
