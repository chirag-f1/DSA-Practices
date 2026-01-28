public class linersearch {
    public static void main(String[] args) {
        int []nums={1,2,3,45,5,6,5,6,4,6,45,4,5};
        int target =45;
        System.out.println( "index number of tatget is " +linearsearch(nums,target));

    }
    static int linearsearch(int []arr, int target ) {
        if (arr.length == 0) {
            return -1;}

            for (int i = 0; i < arr.length; i++) {
                int element = arr[i];
                if(element==target)
                {
                    return i;
            }
        }
        return -1;
    }

}
