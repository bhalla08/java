public class forEachLoop {
    public static void main(String[] args) {
//        The for-each loop is used to traverse array or collection in java.
//        It is easier to use than simple for loop because we don't need to increment value
//        and use subscript notation.
//
//        It works on elements basis not index. It returns element one by one in the defined variable.
        //Declaring an array
        int arr[]={12,23,44,56,78};
        //Printing array using for-each loop
        for(int i:arr){
            System.out.println(i);
        }
    }
}
