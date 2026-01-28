import java.util.Arrays;

public class summm {
    public static void main(String[] args) {
        int arr[]={2,4,1,5,9};
        int n =arr.length;
        int l=1;
        int r =3;
        int sum[]=new int[n];
        for (int i = 1; i <=n; i++) {
            sum[i]=sum[i-2]+arr[i];

        }
        System.out.println(Arrays.toString(sum));
    }
}
