public class CHARACTERtoSTRING {
    public static void main(String args[]){
        char c='S';
        String s=String.valueOf(c);
        System.out.println("String is: "+s);
    //METHOD2--------------------------------------------------
        char c1='M';
        String s1=Character.toString(c1);
        System.out.println("String is: "+s1);

    }
}
//    We can convert char to String in java using String.valueOf(char)
//        method of String class and Character.toString(char) method of Character class.