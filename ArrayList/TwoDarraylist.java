package ArrayList;
import java.util.ArrayList;;

/**
 * 2Darraylist
 */
public class TwoDarraylist {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer>l1 = new ArrayList<>();
        ArrayList<Integer>l2 = new ArrayList<>();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        l2.add(4);
        l2.add(8);
        l2.add(12);
        l2.add(2);

        list.add(l2);
        list.add(l1);
        System.out.println(list);
       
    }
}
