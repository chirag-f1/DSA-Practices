package Practice.practice;

public class maximum_subarray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        subarray(arr);
    }

    static void subarray(int[] arr) {

        for (int start = 0; start < arr.length; start++) {

            for (int end = start; end < arr.length; end++) {

                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] +"");
                }

                System.out.println(); // new subarray
            }
        }
    }
}
