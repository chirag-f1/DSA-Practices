package Practices.practice;
public class maximum_array{
    public static void main(String[] args) {
        int index=0;
        int arr[]={1 ,2,8,10,4,56,1};
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        System.out.println(index);
    }
}
