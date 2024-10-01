import java.util.Scanner;

class Node {
    int data;
    Node next;


    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linkedlist {
    private Node head;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Question_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Linkedlist list = new Linkedlist();

        System.out.println("Enter the number of elements in the linked list:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            list.insertAtEnd(data);
        }

        System.out.println("Original Linked List:");
        list.display();

        // Reverse the linked list
        list.reverse();

        System.out.println("Reversed Linked List:");
        list.display();

        scanner.close();
    }
}
