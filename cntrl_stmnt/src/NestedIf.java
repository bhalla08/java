public class NestedIf {
    public static void main(String[] args) {
//        The nested if statement represents the if block within another if block.
//        Here, the inner if block condition executes only when outer if block condition is true
        //Creating two variables for age and weight
        int age=20;
        int weight=80;
        //applying condition on age and weight
        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            }
        }


        System.out.println("Example 2");
        //Creating two variables for age and weight
        int age1=25;
        int weight1=48;
        //applying condition on age and weight
        if(age1>=18){
            if(weight1>50){
                System.out.println("You are eligible to donate blood");
            } else{
                System.out.println("You are not eligible to donate blood");
            }
        } else{
            System.out.println("Age must be greater than 18");
        }
    }
}
