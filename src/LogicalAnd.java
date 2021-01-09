public class LogicalAnd {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=20;
        System.out.println("Example 1");
        System.out.println(a<b&&a<c);//false && true = false
        System.out.println(a<b&a<c);//false & true = false

        System.out.println("Example 2");

        int x=10;
        int y=5;
        int z=20;
        System.out.println(x<y&&x++<z);//false && true = false
        System.out.println(x);//10 because second condition is not checked
        System.out.println(x<y&x++<z);//false && true = false
        System.out.println(x);//11 because second condition is checked
    }
}
