class Emp{}
public class OBJECTtoSTRING {
    public static void main(String args[]){
        Emp e=new Emp();
        String s=e.toString();
        String s2=String.valueOf(e);
        System.out.println(s);
        System.out.println(s2);
        //METHOD2----------------------------------------------------------------
        System.out.println();
        System.out.println();
        String s1="hello";
        StringBuilder sb=new StringBuilder(s1);
        sb.reverse();
        String rev=sb.toString();//converting StringBuilder to String
        System.out.println("String is: "+s1);
        System.out.println("Reverse String is: "+rev);

        //METHOD3----------------------------------------------------------------
        System.out.println();
        System.out.println();
        String s3="nitin";
        StringBuilder sb1=new StringBuilder(s);
        sb.reverse();
        String rev1=sb1.toString();//converting StringBuilder to String
        if(s3.equals(rev1)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not Palindrome String");
        }
    }
    }


