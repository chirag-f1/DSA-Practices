import java.util.Arrays;

public class prefixsum {
    public static void main(String[] args) {
        int arr[]={2, 4 , 6 , 8 , 10};
        int n = arr.length-1;
        int pref[]= new int[n];
        pref [0]=arr[0];

        for (int i = 1; i < n; i++) {
            pref[i]=pref[i-1]+arr[i];

        }
        for (int k = 0; k < arr.length; k++) {


        }
        System.out.println(Arrays.toString(pref));
    }
}
