package Generic;


interface PrintInterface{
    public void print();
}

class car implements PrintInterface{
    String engine;
    String roof;

    public car(String engine , String roof){
        this.engine = engine;
        this.roof = roof;
    }
    public void print(){
        System.out.println(this.engine + " " + this.roof);
    }
}

class Student implements PrintInterface{
    String name;
    int rollno;
    public Student(String name , int rollno){
        this.name = name ;
        this.rollno = rollno;
    }
    public void print(){
        System.out.println(name + " " + rollno);
    }
}

public class Bound {

    public static <T extends PrintInterface> void printArray(T arr[]){
        for(T i : arr){
            i.print();
        }
    }
    public static void main(String[] args) {
        car c1 = new car("petrol" , "yes");
        car c2 = new car("deisel" , "yes");
        car c3 = new car("electric" , "No");
        car arr[] = {c1 , c2 , c3};
        printArray(arr);
        Student s1 = new Student("petrol" ,1 );
        Student s2 = new Student("deisel" , 2);
        Student s3 = new Student("electric" , 3);
        Student arr2[] = {s1 , s2 , s3};
        printArray(arr2);
    }
}
