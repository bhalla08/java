public class INNER_CLASS_EX {
    private int data=30;
    class Inner{
        void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        INNER_CLASS_EX obj=new INNER_CLASS_EX();
        INNER_CLASS_EX.Inner in=obj.new Inner();
        in.msg();
    }
}
/*
     INTERNAL CODE

import java.io.PrintStream;

public class OUTER$INNER {
    final Outer this$0;
    Outer$Inner()
    {   super();
        this$0 = Outer.this;
    }
    void msg()
    {
        System.out.println((new StringBuilder()).append("data is ")
                .append(Outer.access$000(Outer.this)).toString());
    }
}

 */