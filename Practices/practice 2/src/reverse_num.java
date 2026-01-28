public class reverse_num {
    static void main() {
        int n = 123456;

        int rem=0;
        while(n>0){
            int digit  = n%10;
            rem =digit +rem*10;
            n/=10;
        }
        System.out.println(rem);
    }
}
