public class SinglyLinkedList {

    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        } // end of Constructor
    } // end of class Node


    public static SinglyLinkedList insert(SinglyLinkedList list, int data){

        Node new_Node = new Node(data);

        if(list.head == null)
            list.head = new_Node;
        else {
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_Node;
        }
        return list;
    }

    public static void printList(SinglyLinkedList list){
        Node currNode = list.head;
        System.out.println("LinkedList");
        while(currNode != null){
            System.out.print (currNode.data + " ");
            currNode = currNode.next;
        }
    }


    public static void main(String[] args) {
//        System.out.println("Hello world!");

        SinglyLinkedList list = new SinglyLinkedList();

//        list = insert(list, 1);
//        list = insert(list, 2);
//        list = insert(list, 3);
//        list = insert(list, 4);
//        list = insert(list, 5);
        list = insert(list, 6);


        printList(list);
    }
}