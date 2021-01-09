public class ShiftOperators {
    public static void main(String[] args) {
        //The Java left shift operator
        // << is used to shift all of the bits in a value to the left side of a specified number of times.

        //The Java right shift operator >> is used to move left operands value to right by
        // the number of bits specified by the right operand.

        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20<<2);//20*2^2=20*4=80
        System.out.println(15<<4);//15*2^4=15*16=240


        System.out.println(10>>2);//10/2^2=10/4=2
        System.out.println(20>>2);//20/2^2=20/4=5
        System.out.println(20>>3);//20/2^3=20/8=2
    }
}
