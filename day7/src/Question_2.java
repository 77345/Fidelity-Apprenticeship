import java.util.Scanner;

class Node {
    int data;
    Node next;

    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CustomList {
    private Node head;


    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

public class Question_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList list = new CustomList();

        System.out.println("Enter the number of elements to insert:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            list.insertAtHead(data);
        }

        System.out.println("The linked list after insertion at the head is:");
        list.display();

        scanner.close();
    }
}
