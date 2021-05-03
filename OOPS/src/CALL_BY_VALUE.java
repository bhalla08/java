public class CALL_BY_VALUE {
    int data=50;

    void change(int data){
        data=data+100;//changes will be in the local variable only
    }

    public static void main(String args[]){
        CALL_BY_VALUE op=new CALL_BY_VALUE();

        System.out.println("before change "+op.data);
        op.change(500);
        System.out.println("after change "+op.data);

    }
}
//There is only call by value in java, not call by reference. If we call a method passing a value, it is known as
//call by value. The changes being done in the called method, is not affected in the calling method.