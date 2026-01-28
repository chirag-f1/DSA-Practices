
import java.util.Scanner;
public class findoffeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        int countodd =0;
        System.out.println("enter the size ");
        int size = sc.nextInt();
        System.out.println("enter the array :");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < size; j++) {

            if(arr[j]%2==0) {
                count++;

            }else {
                countodd++;
            }}
            System.out.println("even" + count);
            System.out.println("odd" +countodd);
    }
}