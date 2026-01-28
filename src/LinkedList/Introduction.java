package LinkedList;

class Nodee{
    int data;
    Nodee next;

    public Nodee(int data){
        this.data = data;
    }
}

public class Introduction {
    public static void main(String[] args) {
        Nodee n1 = new Nodee(10);

        Nodee n2 = new Nodee(19);

        Nodee n3 = new Nodee(20);

        n1.next = n2;
        n2.next = n3;

        System.out.println(n1.data);
        System.out.println(n2);
        System.out.println(n1.next);

        System.out.println(n1.next.next.data);
    }
}
