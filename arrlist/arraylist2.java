import java.util.ArrayList;

public class arraylist2 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            l1.add(i);

        }
        System.out.println(l1.size());
        System.out.println(l1);
        System.out.println(l1.get(5));
    }
}
