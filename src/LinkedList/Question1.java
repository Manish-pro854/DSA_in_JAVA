package LinkedList;

class LinkedList{
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    Node head;
    Node tail;
    int size;

    public void addNext(int val){
        Node nn = new Node(val);

        if(this.head==null){
            this.head=nn;
            this.tail=nn;
        }else{
            this.tail.next = nn;
            this.tail = nn;
        }
        this.size++;
    }

    public int size(){
        return this.size();
    }

    public void dispaly(){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.data + ", ");
            temp = temp.next;
        }
    }
}

public class Question1 {
    static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addNext(15);
        ll.addNext(20);
        ll.addNext(14);
        ll.addNext(34);

        ll.dispaly();
    }
}
