package OOPS;


public class CopyConstructor {
    public static void main(String[] args) {

        int marks[] = {100,90,60};
        Student s1 = new Student("mansi" , marks ,23);
        System.out.println(s1.marks[0]);
        // creating another object s2 using copy constructor
        Student s2 = new Student(s1);
        System.out.println(s2.marks[0]);//all the properties of s1 is being copied to s2

        // now changing properties of s1 only
        s1.name = "Mansi Saxena";
        s1.marks[0]=80;
        System.out.println(s1.name + " " + s1.marks[0]);
        // let's check whether any changes happened to s2 or not
        System.out.println(s2.name + " " + s2.marks[0]);

        // you will see that name of s2 is same as previous but the marks has changed.
        // this is because array is non premitive datatype and a referece (i.e) address of same marks[] is allocated to s2
        // this is called shallow copying we can overcome this by following deep copying


    }
}
class Student{
    public String name;
    public int marks[] = new int[3];
    private int rollno;

    // making normal constructor
    Student(String name , int marks[] , int rollno){
        this.name = name;
        this.marks = marks;
        this.rollno = rollno;
    }
    // copy constructor
    Student(Student s){
        this.name = s.name;
        this.rollno = s.rollno;
        // this.marks = s.marks; //shalllow copying
        
        for(int i = 0;  i<s.marks.length; i++){ //deep copying the marks array
            this.marks[i] = s.marks[i];
        }
    }

}
