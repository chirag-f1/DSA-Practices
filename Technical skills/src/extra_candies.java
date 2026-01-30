import java.util.Arrays;

public class extra_candies {
    public static void main(String[] args)
    {
        int arr[]={ 2 , 3  ,5 ,1 , 3};
        int extracandies =3;
        boolean[] ans = kidswithcandies(arr,3);
        System.out.println(Arrays.toString(ans));

    }

    static boolean[] kidswithcandies(int[] arr, int extracandies){
        int max =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }

        }
        boolean [] result = new boolean[arr.length];
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]+ extracandies >= max){
                result[j]=true;
            } else{
                result[j]= false;
            }

        }
        return result;
    }
}
