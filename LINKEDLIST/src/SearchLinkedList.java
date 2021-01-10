public class SearchLinkedList {
    //Represent a node of the singly linked list
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;
    //addNode() will add a new node to the list
    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);
        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }
    //searchNode() will search for a given node in the list
    public void searchNode(int data) {
        Node current = head;
        int i = 1;
        boolean flag = false;
        //Checks whether list is empty
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            while(current != null) {
                //Compares node to be found with each node present in the list
                if(current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if(flag)
            System.out.println("Element is present in the list at the position : " + i);
        else
            System.out.println("Element is not present in the list");
    }

    public static void main(String[] args) {

        SearchLinkedList sList = new SearchLinkedList();

        //Add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        //Search for node 2 in the list
        sList.searchNode(2);
        //Search for a node  in the list
        sList.searchNode(7);
    }
}
//
//    Create a class Node which has two attributes: data and next. Next is a pointer to the next node in the list.
//        Create another class SearchLinkedList which has two attributes: head and tail.
//        addNode() will add a new node to the list:
//        Create a new node.
//        It first checks, whether the head is equal to null which means the list is empty.
//        If the list is empty, both head and tail will point to a newly added node.
//        If the list is not empty, the new node will be added to end of the list such that tail's next will point to a newly added node. This new node will become the new tail of the list.
//        a. searchNode() will search for a node in the list:
//
//        Variable i will keep track of the position of the searched node.
//        The variable flag will store boolean value false.
//        Node current will point to head node.
//        Iterate through the loop by incrementing current to current.next and i to i +
//        Compare each node's data with the searched node if a match is found, set a flag to true.
//        If the flag is true, display the position of the searched node.
//        Else, display the message "Element is not present in the list".
//        a. display() will display the nodes present in the list:
//
//        Define a node current which will initially point to head of the list.
//        Traverse through the list till current points to null.
//        Display each node by making current to point to node next to it in each iteration.
