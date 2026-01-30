package Practice.practice;

import java.util.Arrays;

public class min_max_swap {
    public static void main(String[] args) {
        int arr[]={5,4,3,89,45,99,7};

        int[] ans=findMinMax(arr);
        System.out.println(Arrays.toString(ans));


    }
    static int[] findMinMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];
        int mini=0;
        int maxi=0;

        for(int i = 1; i < arr.length-1; i++) {
            if(arr[i] < min) {
                min = arr[i];
                mini=i;
            }
            if(arr[i] > max) {
                max = arr[i];
                maxi=i;
            }

        }
        int temp=arr[maxi];
        arr[ maxi]=arr[mini];
        arr[mini]  = temp;
        return arr;


}

}