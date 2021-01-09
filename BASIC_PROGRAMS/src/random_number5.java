import java.util.Random;
public class random_number5 {
//    In Java 8, a new method ints() has been added to the Random class. We must import the java.util.Random before using the method.
//
//            ints():
//
//    The pseudorandom int values generated the same as calling the nextInt() method. It returns an unlimited stream of pseudorandom int values.
//
//    ints(long streamSize):
//
//    The method parses a parameter streamSize of type long. It specifies the number of values to be generated. The pseudorandom int values generated the same as calling the nextInt() method. It also returns a stream of randomly generated int values. It throws IllegalArgumentException if the stream size is less than zero.
//
//            ints(long streamSize, int randomNumberOrigin, int randomNumberBound):
//
//    Parameters:
//
//    streamSize:Number of values to generate.
//            randomNumberOrigin:Origin of each random value
//    randomNumberBound:Bound of each random value
//    It returns a stream of pseudorandom int values with the specified origin and bound. It throws IllegalArgumentException if:
//
//    stramSize < 0
//    origin > = bound
//    ints(int randomNumberOrigin, int randomNumberBound):
//    Parameters:
//
//    randomNumberOrigin: Origin of each random value
//    randomNumberBound: Bound of each random value
//    It returns an unlimited stream of pseudorandom int values with the specified origin and bound. It throws IllegalArgumentException if the origin is greater than or equal to bound.
//
//            Similarly, we can also generate the stream of long and double types by using the longs() and doubles() method, respectively.
//
//            Let's create a program that generates a stream of integers using the ints() method of the Random class.

    public static void main(String[] args)
    {
        randomInts(5);
        randomInts(9, 50, 90);
//getStreamOfRandomInts(30, 50);
    }
    //method that generates a stream of integers having size 5
    public static void randomInts(int num)
    {
        Random random = new Random();
        random.ints(num).forEach(System.out::println);
    }
    //method that generates a stream of 9 integers between 50 to 90
    public static void randomInts(int num, int origin, int bound)
    {
        Random random1 = new Random();
        random1.ints(num, origin, bound).forEach(System.out::println);
    }
}
