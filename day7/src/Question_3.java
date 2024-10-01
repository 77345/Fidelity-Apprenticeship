import java.util.Scanner;

class node {
    int data;
    Node next;

    // Constructor
    public node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linkedlist1 {
    private Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null || current.next == null) {
                System.out.println("Position out of bounds");
                return;
            }
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
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

public class Question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Linkedlist1 list = new Linkedlist1();

        System.out.println("Enter the number of elements for the linked list:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            list.insertAtHead(data);
        }

        System.out.println("Enter the value to insert:");
        int value = scanner.nextInt();

        System.out.println("Enter the position to insert the value:");
        int position = scanner.nextInt();

        list.insertAtPosition(value, position);

        System.out.println("The updated linked list is:");
        list.display();

        scanner.close();
    }
}
