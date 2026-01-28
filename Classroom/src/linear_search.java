import java.util.Scanner;
public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size :");
        int size = sc.nextInt();

        int arr[]= new int[size];
        for(int j =0; j<size;j++){
            arr[j] = sc.nextInt();
        }

        System.out.println("enter the target ");
        int target  = sc.nextInt();
        int ans =search(arr,target);
        System.out.println(" index of the target is :"+ans);


    }
    static int search(int arr[],int target){
        for (int i = 0; i < arr.length; i++) {
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
