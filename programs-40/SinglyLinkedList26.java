class Node {
    public int data;
    public Node next;

    public void displayNodeData() {
        System.out.println(" { " + data + " } ");
    }
}
public class SinglyLinkedList26 {
    private Node head;

    public boolean isEmpty() {
        return(head == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public Node deleteFirst() {
        Node temp = head;
        head = head.next;
        return temp;
    }

    public void deleteAfter(Node after) {
        Node temp = head;
        while(temp.next != null && temp.data != after.data) {
            temp = temp.next;
        }

        if(temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void insertLast(int data) {
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }

        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }

    public void printLinkedList() {
        System.out.println("Printing Linked List(head ---> last) ");
        Node current = head;
        while(current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String [] args) {
        SinglyLinkedList26 myLinkedList = new SinglyLinkedList26();
        myLinkedList.insertFirst(1);
        myLinkedList.insertFirst(4);
        myLinkedList.insertFirst(7);
        myLinkedList.insertFirst(10);
        myLinkedList.insertFirst(13);

        Node node = new Node();
        node.data = 1;
        myLinkedList.deleteAfter(node);
        myLinkedList.printLinkedList();
    }
}
