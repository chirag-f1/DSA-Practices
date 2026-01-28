import java.util.*;
import java.util.Arrays;

public class duplicate_delete {
    public static void main(String[] args) {
      int arr[]={1,2,3,4,2,5};
      int size =arr.length;
      Scanner sc = new Scanner(System.in);
        System.out.println("enter the elelment for delete: ");
        int target = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if(arr[i]==target){
                for (int j = i; j < size-1; j++) {
                    arr[j]=arr[j+1];
                }
                size--;
                i--;
            }
            }
        for (int l = 0; l < size; l++) {
            System.out.println(arr[1]);

        }

        }
    }

