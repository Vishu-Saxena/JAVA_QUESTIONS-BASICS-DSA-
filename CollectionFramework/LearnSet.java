package CollectionFramework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student{
    String name ;
    int rollNo;

    public Student(String Name , int rollNo){
        this.name = Name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString(){
        return "{ name: "+this.name+ " , rollNo "+rollNo +" }";
    }
    @Override
    public boolean equals(Object o){
        if(o == this)return true;
        if(o==null || this.getClass() != o.getClass())return false;

        // covert the class type of o to Student
        Student student = (Student)o;

        return this.rollNo == student.rollNo;
    }

     @Override
    public int hashCode(){
        return Objects.hash(this.rollNo);
    }
   
}

public class LearnSet {
    public static void main(String[] args) {
        Student s1 = new Student("Mansi Saxena", 1);
        Student s2 = new Student("Vishu Saxena", 4);

        Set<Student>set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        for (Student student : set) {
            System.out.println(student.toString());
        }
        System.out.println(set);
    }
    
    
}
