//Java Program to get the cube of a given number using the static method
public class Calculate {
    static int cube(int x){
        return x*x*x;
    }
    public static void main(String args[]){
        int result=Calculate.cube(5);
        System.out.println(result);
    }
}
//Another example of a static method that performs a normal calculation

//
//Restrictions for the static method
//        There are two main restrictions for the static method. They are:
//
//        The static method can not use non static data member or call non-static method directly.
//        this and super cannot be used in static context.


//
//Q) Why is the Java main method static?
//        Ans) It is because the object is not required to call a static method. If it were a non-static method,
//        JVM creates an object first then call main() method that will lead the problem of extra memory allocation.