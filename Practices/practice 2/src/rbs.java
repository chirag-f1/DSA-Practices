public class rbs {
    public static void main(String[] args) {
        int arr[]= {4,5,6,7,0,2};
        int target  =7;
        System.out.println(search(arr,target));

    }
    static int search(int arr[] , int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }

        }
        return -1;

    }
}
