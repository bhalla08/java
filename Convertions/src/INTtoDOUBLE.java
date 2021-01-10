public class INTtoDOUBLE {
    public static void main(String args[]){
        int i=200;
        double d=i;
        System.out.println(d);


//METHOD2----------------------------------------------------------------

        int i1=100;
        Double d1= new Double(i1);//first way
        Double d2=Double.valueOf(i1);//second way
        System.out.println(d1);
        System.out.println(d2);
    }
}
