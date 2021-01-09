public class AssignmentOperator {
    public static void main(String[] args) {
       //Java assignment operator is one of the most common operator.
        // It is used to assign the value on its right to the operand on its left.
        int a=10;
        int b=20;
        a+=4;//a=a+4 (a=10+4)
        b-=4;//b=b-4 (b=20-4)
        System.out.println("Example 1");
        System.out.println(a);
        System.out.println(b);

        System.out.println("Example 2");
        int x=10;
        x+=3;//10+3
        System.out.println(x);
        x-=4;//13-4
        System.out.println(x);
        x*=2;//9*2
        System.out.println(x);
        x/=2;//18/2
        System.out.println(x);

        System.out.println("Example 3");
        System.out.println("adding 2 short variables using typecasting");
        short m=10;
        short n=10;
        m=(short)(m+n);//20 which is int now converted to short. this is typecasting..
        System.out.println(m);
    }
}
