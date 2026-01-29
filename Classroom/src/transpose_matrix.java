import java.util.Scanner;

public class transpose_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int a[][] = new int[x][y];
        int b[][] = new int[y][x];


        System.out.println("enter the first matrix");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                a[i][j] = sc.nextInt();
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                b[j][i]=a[i][j];

            }
        }


        System.out.println("after matrix-------");
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(b[i][j]+" ");

            }
            System.out.println();

        }

        }


}
