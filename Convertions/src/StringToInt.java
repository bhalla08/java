public class StringToInt {
    public static void main(String args[]){
//Declaring String variable
        String s="200";
//Converting String into int using Integer.parseInt()
        int i=Integer.parseInt(s);
//Printing value of i
        System.out.println(i);
        System.out.println(s+100);//200100, because "200"+100, here + is a string concatenation operator
        System.out.println(i+100);//300, because 200+100, here + is a binary plus operator
        //converting String into Integer using Integer.valueOf() method
        Integer i1=Integer.valueOf(s);
        System.out.println(i1);

//        If you don't have numbers in string literal, calling Integer.parseInt() or Integer.valueOf()
//        methods throw NumberFormatException.


    }
}
