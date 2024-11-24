package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List lst = new ArrayList<>();
        lst.add(1);
        lst.add(3);
        lst.add(4);
        lst.add(1);
  
        Collections.sort(lst);
        System.out.println(lst);
        Collections.reverse(lst);
        System.out.println(lst);
        List<Integer>list2 =  Collections.unmodifiableList(lst);
        lst.remove(1);
        list2.remove(1);
    }
}
