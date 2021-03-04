class Adder2{
  //  static int add(int a,int b)
   // {return a+b;}
   // static double add(int a,int b)
   // {return a+b;}
}
public class TestOverloading3 {
    public static void main(String[] args){
        System.out.println(Adder.add(11,11));//ambiguity
    }
}
//     Q) Why Method Overloading is not possible by changing the return type of method only?
//        In java, method overloading is not possible by changing the return type of the
//        method only because of ambiguity. Let's see how ambiguity may occur:


//      System.out.println(Adder.add(11,11)); //Here, how can java determine which sum() method should be called?