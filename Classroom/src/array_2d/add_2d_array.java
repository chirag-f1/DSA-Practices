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


    public static class transpose_matrix {
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

    public static class array_addition{
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

    public static class multiplication_matrix {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int[][] a = new int[2][2];
            int[][] b = new int[2][2];
            int[][] c = new int[2][2];

            System.out.println("Enter first matrix:");
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter second matrix:");
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    b[i][j] = sc.nextInt();
                }
            }

            // Multiplication logic
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    c[i][j] = 0;
                    for(int k=0;k<2;k++){
                        c[i][j] = c[i][j] + a[i][k] * b[k][j];
                    }
                }
            }

            System.out.println("Result matrix:");
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static class sum_of_diagonal {
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

            System.out.println("sum of diagonal: ");


        }
    }

    public static class addtion_of_matrix {
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
}
