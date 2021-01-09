import java.util.Random;
public class random_number3 {
//    Using the Random Class
//    Another way to generate a random number is to use the Java Random class of the java.util package.
//    It generates a stream of pseudorandom numbers. We can generate a random number of any data type,
//    such as integer, float, double, Boolean, long. If you are going to use this class to generate random numbers,
//    follow the steps given below:
//
//    First, import the class java.lang.Random.
//    Create an object of the Random class.
//    Invoke any of the following methods:
//    nextInt(int bound)
//    nextInt()
//    nextFloat()
//    nextDouble()
//    nextLong()
//    nextBoolean()
//    All the above methods return the next pseudorandom, homogeneously distributed value (corresponding method) from
//    this random number generator's sequence. The nextDouble() and nextFloat() method generates random value between 0.0 and 1.0.
//
//    The nextInt(int bound) method accepts a parameter bound (upper) that must be positive. It generates a random number in the range 0 to bound-1.
public static void main(String args[])
{
// creating an object of Random class
    Random random = new Random();
// Generates random integers 0 to 49
    int x = random.nextInt(50);
// Generates random integers 0 to 999
    int y = random.nextInt(1000);
// Prints random integer values
    System.out.println("Randomly Generated Integers Values");
    System.out.println(x);
    System.out.println(y);
// Generates Random doubles values
    double a = random.nextDouble();
    double b = random.nextDouble();
// Prints random double values
    System.out.println("Randomly Generated Double Values");
    System.out.println(a);
    System.out.println(b);
// Generates Random float values
    float f=random.nextFloat();
    float i=random.nextFloat();
// Prints random float values
    System.out.println("Randomly Generated Float Values");
    System.out.println(f);
    System.out.println(i);
// Generates Random Long values
    long p = random.nextLong();
    long q = random.nextLong();
// Prints random long values
    System.out.println("Randomly Generated Long Values");
    System.out.println(p);
    System.out.println(q);
// Generates Random boolean values
    boolean m=random.nextBoolean();
    boolean n=random.nextBoolean();
// Prints random boolean values
    System.out.println("Randomly Generated Boolean Values");
    System.out.println(m);
    System.out.println(n);
}
}
