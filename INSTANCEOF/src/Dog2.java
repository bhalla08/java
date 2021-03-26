public class Dog2 {
    public static void main(String args[]){
        Dog2 d=null;
        System.out.println(d instanceof Dog2);//false
    }
}
//If we apply instanceof operator with a variable that have null value, it returns false. Let's see the example
// given below where we apply instanceof operator with the variable that have null value.