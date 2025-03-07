import java.util.ArrayList;

public class arrayslist1 {

    public static void main(String[] args) {
       ArrayList<Integer> l1 = new ArrayList<>();
       l1.add(11);
       l1.add(12);
       l1.add(13);
       l1.add(14);
       l1.add(15);
    for (int x  : l1) {
        System.out.println(x);
    }

    l1.remove(0);
    for (int x  : l1) {
        System.out.println(x);
    }
      
    }
}