import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListORLinkedList {
    public static void main(String args[]){

        List<String> al=new ArrayList<String>();//creating arraylist
        al.add("Ravi");//adding object in arraylist
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        List<String> al2=new LinkedList<String>();//creating linkedlist
        al2.add("James");//adding object in linkedlist
        al2.add("Serena");
        al2.add("Swati");
        al2.add("Junaid");

        System.out.println("arraylist: "+al);
        System.out.println("linkedlist: "+al2);
    }
}
/*
When to use ArrayList and LinkedList in Java
ArrayList provides constant time for search operation, so it is better to use ArrayList if searching is more frequent
operation than add and remove operation. The LinkedList provides constant time for add and remove operations. So it is
better to use LinkedList for manipulation.

ArrayList has O(1) time complexity to access elements via the get and set methods.

LinkedList has O(n/2) time complexity to access the elements.

LinkedLinked class implements Deque interface also, so you can get the functionality of double ended queue in LinkedList.
The ArrayList class doesn't implement Deque interface.




ArrayList	                                                                                        LinkedList
1) ArrayList internally uses a dynamic array to store the elements.	                                LinkedList internally uses a doubly linked list to store the elements.
2) Manipulation with ArrayList is slow because it internally uses an array.
If any element is removed from the array, all the bits are shifted in memory.	                    Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
3) An ArrayList class can act as a list only because it implements List only.	                    LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
4) ArrayList is better for storing and accessing data.	                                            LinkedList is better for manipulating data.
 */