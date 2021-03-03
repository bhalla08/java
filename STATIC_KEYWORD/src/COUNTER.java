public class COUNTER {
    int count=0;//will get memory each time when the instance is created

    COUNTER(){
        count++;//incrementing value
        System.out.println(count);
    }

    public static void main(String args[]){
//Creating objects
        COUNTER c1=new COUNTER();
        COUNTER c2=new COUNTER();
        COUNTER c3=new COUNTER();
    }
}
//Program of the counter without static variable
