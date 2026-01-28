public class maxvalue {
    public static void main(String[] args) {
        int arr[] ={2, 10 , 456 , 3 , 0};

        System.out.println(minrange(arr ,0 ,3));

    }
    static int minrange(int arr[], int index1, int index2) {
        int minni = arr[0];
        for (int i = index1; i < index2; i++) {
            if (minni > arr[i]){
            minni = arr[i];}

        }
        return minni;
    }

}