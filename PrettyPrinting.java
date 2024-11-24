public class PrettyPrinting {
    public static void main(String[] args) {
        int a = 1;
        float b = 1.3289f;
        String name = "mansi";

        System.out.printf("%d \n",a);
        System.out.printf("%.3f \n" , b);
        System.out.printf("%s \n",name);

        int age = 22;
        System.out.printf("my name is %s , my age is %d \n" , name, age);

    }
}
