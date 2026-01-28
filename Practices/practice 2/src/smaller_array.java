import java.util.Arrays;

public class smaller_array {
   public static void main(String[] args) {
       int arr[]={8,1,2,2,3};
       int ans[]=coutning(arr);
       System.out.println(Arrays.toString(ans));



    }
    static int[] coutning(int[] arr){
       int  n = arr.length;
       int count;
       int result[]=new int[n];

        for (int i = 0; i < n; i++) {
            count=0;
            for (int j = 0; j < n; j++) {
                if(arr[j]<arr[i]){
                    count++;
                    result[i]=count;

                }

            }


        }
        return result;

    }
}
