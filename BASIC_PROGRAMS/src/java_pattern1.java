public class java_pattern1 {
//    Java pattern program enhances the coding skill, logic, and looping concepts. It is mostly asked in Java interview
//    to check the logic and thinking of the programmer. We can print a Java pattern program in different designs. To learn
//    the pattern program, we must have a deep knowledge of the Java loop, such as for loop do-while loop. In this section,
//    we will learn how to print a pattern in Java.
//
//    We have classified the Java pattern program into three categories:
//
//    Start Pattern
//    Number Pattern
//    Character Pattern
//    Before moving to the pattern programs, let's see the approach.
//
//
//    Whenever you design logic for a pattern program, first draw that pattern in the blocks, as we have shown in the following
//    image. The figure presents a clear look of the pattern.
//
//    Each pattern program has two or more than two loops. The number of the loop depends on the complexity of pattern or logic.
//    The first for loop works for the row and the second loop works for the column. In the pattern programs, Java for loop is
//    widely used.
public static void main(String[] args) {


    for (int i = 0; i < 5; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

//    *
//    * *
//    * * *
//    * * * *
//    * * * * *
}}