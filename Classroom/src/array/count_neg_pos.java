package Classroom.src.array;

import java.util.Scanner;

public class count_neg_pos {
    public static void main(String[] args) {
        System.out.println("enter the size of array: ");
        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();
        int arr [] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int count_pos =0;
        int count_neg= 0;
        int count_zero =0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]<0){
                count_neg++;

            } else if (arr[j]>0) {
                count_pos++;
            }
            else{
                count_zero++;
            }
        }
        System.out.println("total positive number is : "+ count_pos);
        System.out.println("total negative number is : "+ count_neg);
        System.out.println("total zero  number is : "+ count_zero);
    }
}
