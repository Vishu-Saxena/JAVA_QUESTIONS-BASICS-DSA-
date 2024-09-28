package OOPS;
 
class Student{
    // either inisialize final variable at the time of declaration or in the constructor
    final int rollno = 90;
    static String Name;

}

public class Practice {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.Name = "Mansi saxena";
        System.out.println(s2.Name);
        s2.Name = "Vishu Saxena";
        System.out.println(s1.Name);
    }
}