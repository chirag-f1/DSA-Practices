package Classroom.src.array_2d;
import java.util.*;

public class add_2d_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int a[][] = new int[r][c];
        int b[][]= new int[r][c];
        int sum[][]= new int[r][c];

        System.out.println("enter the  first matrix element : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j]=sc.nextInt();

            }

        }

        System.out.println("enter the second matrix element : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j]=sc.nextInt();

            }


        }


        System.out.println("addtion of 2d array matrix is : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j]=a[i][j]+b[i][j];

            }
        }


        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j]+ " ");

            }
            System.out.println();

        }
    }


}
