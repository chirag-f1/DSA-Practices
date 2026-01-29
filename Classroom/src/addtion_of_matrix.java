import java.util.Arrays;
import java.util.Scanner;

public class addtion_of_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int a[][] = new int[x][y];
        int b[][] = new int[x][y];
        int sum[][] = new int[x][y];

        System.out.println("enter the first matrix");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the second matrix :");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("addtion_of_sum:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sum[i][j] = a[i][j] * b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}



