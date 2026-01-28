import java.util.Scanner;

public class occurence_0f_array {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("enter the size ");
            int size = sc.nextInt();
            System.out.println("enter the array :");
            int arr[] = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("enter the target :");
            int target =sc.nextInt();
            int count =0;

            for (int j = 0; j <arr.length ; j++) {
                if (arr[j]==target) {
                    count++;

                }
            }
            System.out.println("occurence of the input :" + count);
}}

