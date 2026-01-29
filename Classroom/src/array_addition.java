package Classroom.src;

import java.util.*;
public class array_addition{
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0]=3;
        arr[1]= 6;
        arr[2] =11;
        arr[3]=15;
        arr[4]=20;

        // using functionnn-----

//        int ans =add(arr);
//        System.out.println(ans);
//    }
//    static int add(int arr[]){
//           int sum =0;
//        for (int i = 0; i < arr.length ; i++) {
//            sum+=arr[i];
//        }
//        return sum;
//    }
//}
      // using loops--------

    int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);

        }}

