public class LOCAL_INNER2 {
    private int data=30;//instance variable
    void display(){
        int value=50;//local variable must be final till jdk 1.7 only
        class Local{
            void msg(){System.out.println(value);}
        }
        Local l=new Local();
        l.msg();
    }
    public static void main(String args[]){
        LOCAL_INNER2 obj=new LOCAL_INNER2();
        obj.display();
    }
}
