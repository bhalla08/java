public class CUSTOM_WRAPPER_CLASS {
    private int i;
    CUSTOM_WRAPPER_CLASS(){}
    CUSTOM_WRAPPER_CLASS(int i){
        this.i=i;
    }
    public int getValue(){
        return i;
    }
    public void setValue(int i){
        this.i=i;
    }
    @Override
    public String toString() {
        return Integer.toString(i);
    }
}
//Testing the custom wrapper class
public class TestJavatpoint{
    public static void main(String[] args){
        CUSTOM_WRAPPER_CLASS j=new CUSTOM_WRAPPER_CLASS(10);
        System.out.println(j);
    }
}
