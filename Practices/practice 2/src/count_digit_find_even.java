public class count_digit_find_even {
    public static void main(String[] args) {
        int arr[]={45,52, 1, 456,487,4567};
        int count=0;
        int nums =0;
        System.out.println(digit(arr,0,0));


    }
    static int digit(int arr[], int nums,int count){
        for (int i = 0; i < arr.length; i++) {
            nums=arr[i];
            int digit=0;
            while(nums>0){
                nums/=10;
                digit++;

            }
            if(digit%2==0){

                count++;
            }
        }
        return count;

    }
}
