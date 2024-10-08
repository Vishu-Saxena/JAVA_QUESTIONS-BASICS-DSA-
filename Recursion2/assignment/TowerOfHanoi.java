package Recursion2.assignment;

public class TowerOfHanoi {

    public static void towerOfHanoi(int towers , char source , char auxillary , char destination){
        if(towers == 1){
            System.out.println(source + " " + destination);
            return;
        }
        towerOfHanoi(towers-1, source, destination, auxillary);
        System.out.println(source + " " + destination);
        towerOfHanoi(towers-1, auxillary, source, destination);
    }
    public static void main(String[] args) {
        towerOfHanoi(2, 'a', 'b', 'c');
    }
}
