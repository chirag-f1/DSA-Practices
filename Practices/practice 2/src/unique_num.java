public class unique_num {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4, 56, 4, 1};

        System.out.println(uniquesearch(arr));

    }

    static int uniquesearch(int arr[]) {
//
//        // Duplicate ko -1 mark kar rahe hain
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    arr[i] = -1;
//                    arr[j] = -1;
//                }
//            }
//        }
        int ans=0;
//
//        // Jo -1 nahi hai wahi unique hoga
//        for (int z = 0; z < arr.length; z++) {
//            if (arr[z] != -1) {
//                return arr[z];
        for (int i = 0; i < arr.length; i++) {
             ans ^=arr[i];
        }

            return ans;
        }

    }

