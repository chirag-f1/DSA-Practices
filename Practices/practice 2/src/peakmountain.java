public class peakmountain{
    public static void main(String[] args) {
        int arrr[] ={0 ,7,8,9, 10 , 5 , 2};
        System.out.println(search(arrr));
    }
    static int search(int arrr[]){
        int start =0;
        int end = arrr.length-1;
        while(start<end){
            int mid =start + (end -start)/2;
            if (arrr[mid]>arrr[mid+1]){
                end =mid;
            }else{
                start = mid+1;
            }
        }
        return start;

    }
}