public class IntToString {
    public static void main(String args[]){
        int i=200;
        String s=String.valueOf(i);
        System.out.println(i+100);//300 because + is binary plus operator
        System.out.println(s+100);//200100 because + is string concatenation operator


        //METHOD--2-------------------------------------------------
        String s1=Integer.toString(i);
        System.out.println(i+100);//300 because + is binary plus operator
        System.out.println(s1+100);//200100 because + is string concatenation operator

        //METHOD--3-------------------------------------------------
        String s2=String.format("%d",i);
        System.out.println(s2);
    }
    }

//    We can convert int to String in java using String.valueOf() and Integer.toString() methods. Alternatively, we can
//    use String.format() method, string concatenation operator etc.