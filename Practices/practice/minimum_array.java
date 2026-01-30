package Practices.practice;
public class minimum_array{
    public static void main(String[] args) {
        int arr[]={5, 4,1,8,2};
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min>arr[i]){
                min =arr[i];
            }

        }
        System.out.println(min);
    }
}