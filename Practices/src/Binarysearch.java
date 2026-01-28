public class Binarysearch{
    public static void main(String[] args) {
        int arr[]= {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = binaryseach(arr,target);
        System.out.println(ans + "= "+ arr[ans]);

    }
    static int binaryseach(int arr[], int target){
        int start =0;
        int end =arr.length-1;

        boolean isasc=arr[start]<arr[end];

        while(start<=end) {

            int mid = start + (end - start) / 2;

            if(target==arr[mid]){
                return mid;
            }
            if(isasc){
                if (target < arr[mid]) {
                end = mid - 1;

            } else  { start = mid + 1;}
            } else{
                if (target > arr[mid]) {
                    end = mid - 1;
            }else{start = mid+1;}}
            }
            return end;
        }
    }
