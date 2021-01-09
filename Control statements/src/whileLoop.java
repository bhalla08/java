public class whileLoop {
    public static void main(String[] args) {
//        The Java while loop is used to iterate a part of
//        the program several times. If the number of iteration is not fixed, it is recommended to use while loop.
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;

            System.out.println("example 2 (infinitive while loop)");
            while(true){
                System.out.println("infinitive while loop");
            }
        }
    }
}



