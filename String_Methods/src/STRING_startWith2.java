public class STRING_startWith2 {
    public static void main(String[] args) {
        String str = "Javatpoint";
        System.out.println(str.startsWith("J")); // True
        System.out.println(str.startsWith("a")); // False
        System.out.println(str.startsWith("a",1)); // True
    }
}
