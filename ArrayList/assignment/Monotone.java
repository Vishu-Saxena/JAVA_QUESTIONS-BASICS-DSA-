package ArrayList.assignment;
import java.util.ArrayList;;

public class Monotone {
    static boolean monotoneArr(ArrayList<Integer>list){
        // check whether it is monotonic increasing or not
        boolean monoInc = true;
        boolean monoDec = true;
        for(int i =0 ; i<list.size()-1; i++){
            if(list.get(i)>list.get(i+1)){
                monoInc = false;
            }
        }
        if(monoInc){
            return true;
        }
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i)<list.get(i+1)){
                monoDec = false; 
            }
        }
        if(monoDec){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>lst = new ArrayList<>();
        lst.add(19);
        lst.add(19);
        lst.add(13);
        lst.add(11);
        System.out.println(monotoneArr(lst));
    }
}
