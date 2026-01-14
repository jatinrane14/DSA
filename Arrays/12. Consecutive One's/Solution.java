public class Solution {
    public static int consecOnes(int bArr[]){
        int count= 0;
        int max =0;
        for (int i = 0; i < bArr.length; i++) {
            if(bArr[i]==1){
                count++;
            }else{
                count=0;
            }
            if(max<count){
                max = count;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int binaryArray[] = {1,1,0,1,1,1,0,0,1,1,1,1};
        System.out.println(consecOnes(binaryArray));
    }
}
