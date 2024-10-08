
import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    
    public boolean isEmpty() {
        return front == null;
    }

    
    public void enqueue(int data) {
        Node newNode = new Node(data);

       
        if (this.rear == null) {
            this.front = this.rear = newNode;
            System.out.println(data + " enqueued to queue");
            return;
        }


        this.rear.next = newNode;
        this.rear = newNode;
        System.out.println(data + " enqueued to queue");
    }

    
    public int dequeue() {
       
        if (this.front == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }

        
        int dequeued = this.front.data;
        this.front = this.front.next;

    
        if (this.front == null) {
            this.rear = null;
        }

        return dequeued;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        } else {
            return front.data;
        }
    }


    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    
}

public class Lab11_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue();
        int choice, value;

        while (true) {
            System.out.println("\nQueue Operations Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    value = queue.dequeue();
                    if (value != Integer.MIN_VALUE) {
                        System.out.println(value + " dequeued from queue");
                    }
                    break;
                case 3:
                    value = queue.peek();
                    if (value != Integer.MIN_VALUE) {
                        System.out.println("Front element is " + value);
                    }
                    break;
                case 4:
                    System.out.println("Queue elements:");
                    queue.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
}