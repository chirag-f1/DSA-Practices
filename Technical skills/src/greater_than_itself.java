public class greater_than_itself {
    public static void main(String[] args) {
        int arr[] = {-3, 2, 6, 8, 4, 8, 5};
        int ans = max_find(arr);
        System.out.println(ans);
    }
    static int max_find(int arr[]){
        int max = arr[0];
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            for (int j = 0; j < arr.length; j++) {
                if(max!=arr[j]){
                    count++;
                }
            }
            return count;
        }
return -1;
    }
}
