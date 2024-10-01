import java.util.Scanner;

// LinkedList class to handle linked list operations
class LinkedList {
    Node head;  // head of the list

    // Linked list node
    class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Method to insert a new node at the end of the list
    public void insertAtTail(int data) {
        // Create a new node
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Otherwise, find the last node and insert the new node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Method to print the linked list with -> symbol
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();  // Newline after printing the list
    }
}

// Main class to run the program
public class linked {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        // Get the size of the linked list
        System.out.print("Enter the size of the linked list: ");
        int n = scanner.nextInt();

        // Insert the nodes
        System.out.println("Enter the linked list data values:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            list.insertAtTail(data);
        }

        // Print the final linked list
        System.out.println("The linked list is:");
        list.printList();

        scanner.close();
    }
}
