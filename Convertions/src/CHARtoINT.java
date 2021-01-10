public class CHARtoINT {
    public static void main(String args[]){
        char c='a';
        char c2='1';
        int a=c;
        int b=c2;
        System.out.println(a);
        System.out.println(b);



        //METHOD2--------------------------------------------------
        char c1='1';
        int a1=Character.getNumericValue(c1);
        System.out.println(a1);

        //METHOD3----------------------------------------------------
        char c3='1';
        int a2=Integer.parseInt(String.valueOf(c3));
        System.out.println(a2);
    }
    }

