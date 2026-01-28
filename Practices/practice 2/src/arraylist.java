import java.util.ArrayList;

public class arraylist {
    public static void main(String[]args){
        ArrayList<Integer> result = new ArrayList<>(3);
        result.add(45);
        result.add(48);
        result.add(23);
        result.add(58);
        System.out.println(result.get(2));
    }
}
