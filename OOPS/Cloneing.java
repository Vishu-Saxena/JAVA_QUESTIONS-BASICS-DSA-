package OOPS;

class ABC implements Cloneable{
    int i ;
    int j;
    int arr[] = {1,2,3};

    // @override;
    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}
public class Cloneing {

        public static void main(String[] args) throws CloneNotSupportedException {
        ABC obj1 = new ABC();
        obj1.i = 0;
        obj1.j = 2;

        ABC obj2  = (ABC) obj1.clone();
        obj2.i = 9;
        obj2.arr[0] = 10;
        System.out.println(obj1.arr[0]);
        System.out.println(obj2.arr[0]);
    }
}