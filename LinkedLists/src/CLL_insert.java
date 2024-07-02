class CLL_insert {

//    Node head;
//    Node tail;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next  = null;
        } // end of constructor
    } // end of static class Node


    // Insert Operations

    // Insert at beginning

    private Node head = null;
    private Node tail = null;
    public void insert(int data){
        Node new_Node = new Node(data);
        // if the list is empty insert at the beginning
        if(head == null){
            head = new_Node;
            tail = new_Node;
            tail.next = head;
            System.out.println(data + " inserted at the beginning of the list! ");
        } // if the list is not empty, then insert at the end of the list
        else{
            new_Node.next = head;
            head = new_Node;
            tail.next = head;
            System.out.println(data + " inserted at the end of the list");
        }
    } // end of insert function


    // Insert at the end of the list

    public void insert_at_end(int data){
        Node new_Node = new Node(data);

        // if the list is empty insert at beginning of the list
        if(head == null){
            head = new_Node;
            tail = new_Node;
            tail.next = head;
            System.out.println(data + " inserted at the beginning of the list");
        } // else insert at the end of the list
        else{
            tail.next = new_Node;
            tail = new_Node;
            tail.next = head;
            System.out.println(data + " inserted at the end of the list! ");
        }
    }



    public void printList(CLL_insert list){


        // if the list is empty return to the calling function
        if(head == null){
            System.out.println("List is empty!");
        }
        // if the list has values print all the values from the list
        Node temp = head;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    } // end of printList ()



    public static void main(String[] args) {

        CLL_insert list = new CLL_insert();

        list.insert(0);
        list.insert(2);
        list.insert(4);
        list.insert_at_end(4);
        list.insert_at_end(6);

        list.printList(list);
    }
























} // end of class CLL_insert
//
//class CircularSinglyLinkedList {
//    // Node class representing each element in the list
//    class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//        }
//    }
//
//    private Node head = null;
//    private Node tail = null;
//
//    // Method to insert a node at the beginning of the list
//    public void insertAtBeginning(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//            tail = newNode;
//            tail.next = head;
//        } else {
//            newNode.next = head;
//            head = newNode;
//            tail.next = head;
//        }
//    }
//
//    // Method to insert a node at the end of the list
//    public void insertAtEnd(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//            tail = newNode;
//            tail.next = head;
//        } else {
//            tail.next = newNode;
//            tail = newNode;
//            tail.next = head;
//        }
//    }
//
//    // Method to insert a node at a given position
//    public void insertAtPosition(int data, int position) {
//        if (position < 1) {
//            System.out.println("Position should be >= 1.");
//            return;
//        }
//        Node newNode = new Node(data);
//        if (position == 1) {
//            insertAtBeginning(data);
//            return;
//        }
//
//        Node current = head;
//        for (int i = 1; i < position - 1; i++) {
//            if (current != tail) {
//                current = current.next;
//            } else {
//                System.out.println("Position out of bounds.");
//                return;
//            }
//        }
//
//        newNode.next = current.next;
//        current.next = newNode;
//
//        if (current == tail) {
//            tail = newNode;
//            tail.next = head;
//        }
//    }
//
//    // Method to display the elements of the list
//    public void display() {
//        if (head == null) {
//            System.out.println("List is empty.");
//            return;
//        }
//
//        Node current = head;
//        do {
//            System.out.print(current.data + " ");
//            current = current.next;
//        } while (current != head);
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
////            CircularSinglyLinkedList list = new CircularSinglyLinkedList();
//        CLL_insert list = new CLL_insert();
//        // Insert at beginning
//        list.insertAtBeginning(3);
//        list.insertAtBeginning(2);
//        list.insertAtBeginning(1);
//        list.display(); // Output: 1 2 3
//
//        // Insert at end
//        list.insertAtEnd(4);
//        list.insertAtEnd(5);
//        list.display(); // Output: 1 2 3 4 5
//
//        // Insert at given position
//        list.insertAtPosition(10, 3);
//        list.display(); // Output: 1 2 10 3 4 5
//
//        list.insertAtPosition(20, 1);
//        list.display(); // Output: 20 1 2 10 3 4 5
//
//        list.insertAtPosition(30, 8);
//        list.display(); // Output: 20 1 2 10 3 4 5 30
//
//        // Out of bounds
//        list.insertAtPosition(40, 10);
////        }
//    }
