import java.util.Arrays;
import java.util.Scanner;

public class reverse_an_array {
    public static void main(String[] args) {
        int arr[] =new int[6];
        System.out.println("enter the values for array :");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        reverse(arr);{

        System.out.println(Arrays.toString(arr));}


    }
    public static void reverse(int arr[]){
        int start =0;
        int end= arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }

    static void swap(int[]arr,int index1 , int index2 ){
        int temp = arr[index1];
        arr[index1] = arr[index2];
         arr[index2] =temp;
                ;

    }
}