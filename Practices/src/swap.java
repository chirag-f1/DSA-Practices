import java.util.Arrays;
import java.util.Scanner;

public class swap {

    static void swap(int arr[],int index1 ,int index2){
        int temp = arr[index1];
        arr[index1] =arr[index2];
        arr[index2] =temp;}

        public static void main(String[] args) {
        int arr[]= new int[5];

        System.out.println("enter the arrays valuess : ");
        Scanner sc =  new Scanner(System.in);
        for(int i = 0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

            System.out.println("before swap________________");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");


        }

            System.out.println("");
            System.out.println("after swap_____________");
            swap( arr, 0 , 3);{

                    System.out.print (Arrays.toString(arr));
                }




        }
    }

