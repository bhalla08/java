public class CALL_BY_VALUE2 {
    int data=50;

    void change(CALL_BY_VALUE2 op){
        op.data=op.data+100;//changes will be in the instance variable
    }


    public static void main(String args[]){
        CALL_BY_VALUE2 op=new CALL_BY_VALUE2();

        System.out.println("before change "+op.data);
        op.change(op);//passing object
        System.out.println("after change "+op.data);

    }
}
