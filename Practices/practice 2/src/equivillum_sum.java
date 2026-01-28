public class equivillum_sum {
    static void main(String[] args) {
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        int ans = preffix(arr);
        System.out.println(ans);

    }
    static int preffix(int[] arr){
int total =0;
int left =0;
        for (int i = 0; i <arr.length ; i++) {
            total+=arr[i];
        }
        int n = arr.length;

        for (int j = 0; j < n; j++) {
            int right = total-left-arr[j];
            if(left==right){
                return j;
        }
            left+=arr[j];

        }
return -1;
    }


}
