package OOPS;

public class Fraction {

    private int numerator;
    private int demonenator;
    
    public  int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        
        this.numerator = numerator;
    }

    public int getDemonenator() {
        return demonenator;
    }

    public void setDemonenator(int demonenator) {
        if(demonenator == 0){
            System.out.println("invalid denominator");
            return;
        }
        this.demonenator = demonenator;
    }

    // constructor
    Fraction(int num , int deno){
        if(deno == 0){
            System.out.println("invalid denominator");
            return;
        }
        simplify(num , deno);
        System.out.println(this.numerator + "/" + this.demonenator);
    }


    // simplify function to convert the fraction into it's simplest form
    public void simplify( int num , int deno){
        // finding greatest common divisor of numerator nd denomenator
        int smaller = Math.min(num, deno);
        int gcd = 1;
        for(int i = smaller ; i>=2 ; i--){
            if(num%i == 0 && deno%i == 0){
                gcd = i;
                break;
            }
        }
        this.numerator = num/gcd;
    
        this.demonenator = deno/gcd;
    }

    // function to increment two fractions

    public static void increment(Fraction f1 ){
        int num = f1.numerator;
        int den = f1.demonenator;
        f1.setNumerator(num+den);
        System.out.println(num+den + "/" + den);
    }

    // function to add two fractions
    public static Fraction addition(Fraction f1 , Fraction f2){
        int num1 = f1.numerator;
        int num2 = f2.numerator;
        int den1 = f1.demonenator;
        int den2 = f2.demonenator;

        int numRes = num1*den2 + num2*den1;
       
        int denRes = den1*den2;
      

        Fraction f = new Fraction(numRes, denRes);
        return f;
    
    }

    // function to subract two numbers
    public static Fraction subtraction(Fraction f1 , Fraction f2){
        int num1 = f1.numerator;
        int num2 = f2.numerator;
        int den1 = f1.demonenator;
        int den2 = f2.demonenator;

        int numRes = num1*den2 - num2*den1;
       
        int denRes = den1*den2;
      

        Fraction f = new Fraction(numRes, denRes);
        return f;
    }

    // function to multiply two fractions
    public static Fraction multiply(Fraction f1 , Fraction f2){
        int numres = f1.numerator*f2.numerator;
        int denores = f1.demonenator*f2.demonenator;
        Fraction mulFac = new Fraction(numres, denores);
        return mulFac;
    }

    // funciton to devide two fractions 
    public static Fraction divide(Fraction f1 , Fraction f2){
        int numres = f1.numerator*f2.demonenator;
        int denores = f1.demonenator*f2.numerator;
        Fraction divFrac = new Fraction(numres, denores);
        return divFrac;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(9, 54);
        Fraction f2 = new Fraction(2, 6);
        // increment(f1);
        // System.out.println(f1.getNumerator());

        addition(f1, f2);
        subtraction(f2, f1) ;
        multiply(f1, f2);
        divide(f1, f2);
    }
}
