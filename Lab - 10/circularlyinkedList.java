
class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {

    private Node head = null;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public int countNodes() {
        if (head == null) {
            return 0;
        }

        int count = 1;
        Node temp = head;
        while (temp.next != head) {
            count++;
            temp = temp.next;
        }
        return count;
    }

}

public class circularlyinkedList {

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Number of nodes in the circular linked list: " + list.countNodes());
    }

}
