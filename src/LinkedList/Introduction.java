package LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}

public class Introduction {
    public static void main(String[] args) {
        Node n1 = new Node(10);

        Node n2 = new Node(19);

        Node n3 = new Node(20);

        n1.next = n2;
        n2.next = n3;

        System.out.println(n1.data);
        System.out.println(n2);
        System.out.println(n1.next);

        System.out.println(n1.next.next.data);
    }
}
