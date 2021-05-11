import java.util.ArrayList;
import java.util.List;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(Integer.valueOf(10));//storing Integer object
        list.add(20);//Now compiler converts it into Integer.valueOf(20) which is object
        list.add(30);

        System.out.println("Traversing List...");
        for(Integer i:list){
            System.out.println(i);
        }
    }
}
/*
Array is a fixed length data structure whereas ArrayList is a variable length Collection class. We cannot change length
of array once created in Java but ArrayList can be changed.

We cannot store primitives in ArrayList, it can only store objects. But array can contain both primitives and objects
in Java. Since Java 5, primitives are automatically converted in objects which is known as auto-boxing.
 */