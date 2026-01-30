package Practice.practice;

public class kadane_algorithm{
    public static void main(String[] args) {
        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(kadane(arr));


    }
    static int kadane(int arr[]){
        int cursum=0;
        int maxsum=arr[0];
        for (int i = 0; i < arr.length; i++) {
            cursum+=arr[i];
            if(maxsum<cursum){
                maxsum=cursum;
            }
            if(cursum<0){
                cursum=0;
            }


        }
        return maxsum;
    }
}