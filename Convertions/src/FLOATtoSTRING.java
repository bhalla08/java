public class FLOATtoSTRING {
    public static void main(String args[]){
        float f=12.3F;//F is the suffix for float
        String s=String.valueOf(f);
        System.out.println(s);

        //METHOD2------------------------------------------
        float f1=89.7F;
        String s1=Float.toString(f1);
        System.out.println(s1);
    }
}
