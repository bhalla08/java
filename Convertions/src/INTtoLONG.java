public class INTtoLONG {
    public static void main(String args[]){
        int i=200;
        long l=i;
        System.out.println(l);


//METHOD2------------------------------------------------------------------


        int i1=100;
        Long l1= new Long(i1);//first way
        Long l2=Long.valueOf(i1);//second way
        System.out.println(l1);
        System.out.println(l2);
    }
    }

