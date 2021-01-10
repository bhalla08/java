public class BOOLEANtoSTRING {
    public static void main(String args[]){
        boolean b1=true;
        boolean b2=false;
        String s1=String.valueOf(b1);
        String s2=String.valueOf(b2);
        System.out.println(s1);
        System.out.println(s2);

    //METHOD2-------------------------------------------------

        boolean b3=true;
        boolean b4=false;
        String s3=Boolean.toString(b3);
        String s4=Boolean.toString(b4);
        System.out.println(s3);
        System.out.println(s4);

    }
}
