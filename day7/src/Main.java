public class Main {
    public static void main(String[] args) {
        Node nd= new Node(20);
        nd.next = null;
        System.out.println(nd.data+" "+nd.next );
        Node nd2 = new Node(30);
        nd.next = nd2;
        System.out.println(nd.data+" "+nd.next);
        System.out.println(nd.data+" -> "+nd.next.data);
        System.out.println(nd2.data+" "+nd2.next);
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.Display();
        ll.addLast(40);
        ll.Display();
        System.out.println();
        ll.addAt(50,2);
        ll.Display();
        System.out.println();
        System.out.println(ll.getFirst());
        System.out.println();
        System.out.println(ll.getLast());
        System.out.println();
        ll.RemoveFirst();
        ll.Display();
        System.out.println();
        ll.RemoveLast();
        ll.Display();
    }
}

