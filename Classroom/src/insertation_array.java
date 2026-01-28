import java.util.Scanner;

public class insertation_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n = 5;
        // Initial array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println("in first : ");
        System.out.println("in last :");
        int choice = sc.nextInt();
        System.out.println("enter the element to want to addd :");
        int num  = sc.nextInt();

        switch (choice){
            case 1:
                for (int i = n; i >0 ; i--) {
                    arr[i]= arr[i-1];
                }
                arr[0] =num;
                n++;

                break;

            case 2:
                arr[n]= num;
                n++;


        break;}
        System.out.println("element after insertation");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }

    }

}
