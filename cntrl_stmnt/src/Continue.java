public class Continue {
//    The continue statement is used in loop control structure when you need to jump to the next iteration
//    of the loop immediately. It can be used with for loop or while loop.
//
//    The Java continue statement is used to continue the loop. It continues the current flow of the
//    program and skips the remaining code at the specified condition. In case of an inner loop, it continues the inner loop only.
//
//    We can use Java continue statement in all types of loops such as for loop, while loop and do-while loop.

    public static void main(String[] args) {
        //for loop
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                //using continue statement
                continue;//it will skip the rest statement
            }
            System.out.println(i);
        }


        //java continue statement with inner loop
//EXAMPLE 2
        //outer loop
        for (int j = 1; j <= 3; j++) {
            //inner loop
            for (int k = 1; k <= 3; k++) {
                if (j == 2 && k == 2) {
                    //using continue statement inside inner loop
                    continue;
                }
                System.out.println(j + " " + k);
            }
        }


        //EXAMPLE 3
        aa:
        for (int i1 = 1; i1 <= 3; i1++) {
            bb:
            for (int j1= 1; j1 <= 3; j1++) {
                if (i1 == 2 && j1 == 2) {
                    //using continue statement with label
                    continue aa;
                }
                System.out.println(i1 + " " + j1);
            }
        }


    }
}