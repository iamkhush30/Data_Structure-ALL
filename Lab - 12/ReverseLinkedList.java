import java.util.Scanner;

public class ReverseLinkedList {
    class Node{
        int info;
        Node link;

        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }
    
    Node first=null;

    public void insertAtFirst(int data) {
        
        Node newNode = new Node(data);

        
        if (first == null) {
            first = newNode;
            return;
        }

        Node save = first;
        
        first = newNode;

        first.link = save;
    }

    public void display() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        Node save = first;
        while (save != null) {
            System.out.print(save.info + " ");
            save = save.link;
        }
        System.out.println("");
    }
    
    public void reverse(){
        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        Node save = first;
        Node prev = null;
        while(save != null){
            Node temp=save.link;
            save.link = prev;
            prev=save;
            save=temp;
        }
        first=prev;
        display();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ReverseLinkedList list = new ReverseLinkedList();

        System.out.println("Enter 1 for inserting nubers into linked list,");
        System.out.println("Enter 2 if you want to see your LL,");
        System.out.println("Enter 3 to reverse your Linked List .");

        boolean istheEnd = false;
        while (true) {
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to be inserted:");
                    int n = sc.nextInt();
                    list.insertAtFirst(n);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    list.reverse();
                    istheEnd = true;
                    break;
                default:
                    System.out.println("invalid choice");
            }
            if (istheEnd) {
                break;
            }
        }
    }
}