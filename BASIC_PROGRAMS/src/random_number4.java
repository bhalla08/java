import java.util.concurrent.ThreadLocalRandom;
public class random_number4 {
//    The ThreadLocalRandom class is defined in java.util.concurrent package. It is initialized with an internally generated seed, the same as the random generator of the Math class. It cannot be modified. We can use this class in the following way:
//
//            ThreadLocalRandom.current().nextX(...)
//    Where X is Int, Long, etc.
//
//    Note: It is impossible to share a ThreadLocalRandom with multiple threads accidentally.
//    We can generate a random number of any data type, such as integer, float, double, Boolean, long. If you are going to use this class to generate random numbers, follow the steps given below:
//
//    First, import the class by using java.util.concurrent.ThreadLocalRandom.
//    Invoke the corresponding method for which you want to generate numbers randomly.
//            nextInt()
//    nextDouble()
//    nextLong()
//    nextFloat()
//    nextBoolean()
//    All the above methods override the corresponding method of the Random class and return the corresponding value.
//
//            nextInt(int bound)
//    nextDouble(int bound)
//    nextLong(int bound)
//    The above methods parse a parameter bound (upper) that must be positive. It returns corresponding randomly generated value between 0 (inclusive) and the specified bound (exclusive). It throws IllegalArgumentExcetion if the bound is negative.
//
//    nextInt(int origin, int bound)
//    nextDouble(int origin, int bound)
//    nextLong(int origin, int bound)
//    The above methods parse two parameters origin and bound. The origin specifies the least value returned and the bound specifies the upper bound. It returns corresponding randomly generated value between the specified origin (inclusive) and bound (exclusive). Also, throws IllegalArgumentExcetion if the origin is greater than or equal to bound.
//
//            Let's create a program that generates random numbers using the ThreadLocalRandom class.

    public static void main(String args[])
    {
// Generate random integers between 0 to 999
        int a = ThreadLocalRandom.current().nextInt();
        int b = ThreadLocalRandom.current().nextInt();
// Print random integer values
        System.out.println("Randomly Generated Integer Values:");
        System.out.println(a);
        System.out.println(b);
// Generate Random double values
        double c = ThreadLocalRandom.current().nextDouble();
        double d = ThreadLocalRandom.current().nextDouble();
// Print random doubles
        System.out.println("Randomly Generated Double Values:");
        System.out.println(c);
        System.out.println(d);
// Generate random boolean values
        boolean e = ThreadLocalRandom.current().nextBoolean();
        boolean f = ThreadLocalRandom.current().nextBoolean();
// Print random Booleans
        System.out.println("Randomly Generated Boolean Values:");
        System.out.println(e);
        System.out.println(f);
    }
}
