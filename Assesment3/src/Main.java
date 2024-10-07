import java.util.Scanner;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public void add(String data) {
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

    public String remove(int index) {
        if (head == null || index < 0) {
            return null;
        }

        if (index == 0) {
            String removedData = head.data;
            head = head.next;
            return removedData;
        }

        Node current = head;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            return null;
        }

        String removedData = current.next.data;
        current.next = current.next.next;
        return removedData;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 4 elements for the linked list:");
        for (int i = 0; i < 4; i++) {
            String element = scanner.nextLine();
            list.add(element);
        }

        System.out.print("Original Linked List: ");
        list.display();

        System.out.print("Enter the index of the element to remove (0 to 3): ");
        int index = scanner.nextInt();

        String removedElement = list.remove(index);
        if (removedElement != null) {
            System.out.println("Removed element: " + removedElement);
        } else {
            System.out.println("Invalid index. Please enter a number between 0 and 3.");
        }

        System.out.print("Updated Linked List: ");
        list.display();

    }
}
