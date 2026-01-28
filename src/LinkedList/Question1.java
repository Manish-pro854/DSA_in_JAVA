package LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}

class LinkedList{

    Node head;
    Node tail;
    int size;

    public LinkedList(){
        this.size = 0;
    }

    public void addLast(int val){
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

    public void addFirst(int val){
        Node nn = new Node(val);

        if(this.head==null){
            this.head=nn;
            this.tail=nn;
        }else{
            nn.next=head;
            head = nn;
        }
        this.size++;
    }

    public void removeFirst(){
        if(this.size==0){
            System.out.println("Empty LinkedList");
            return;
        } else if(this.size==1){
            head=null;
            tail=null;
        }else {
            Node headKaNext = head.next;
            head = headKaNext;
        }
        this.size--;
    }

    public Node getAt(int idx){
        if(idx < 0 || idx >= size){
            System.out.println("Invalid Index!!!!!");
            return null;
        }

        int curr = 0;
        Node temp = head;

        while(curr<idx){
            Node tempKaNext = temp.next;
            temp = tempKaNext;
            curr++;
        }
        return temp;
    }

    public int size(){
        return this.size();
    }

    public void dispaly(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Question1 {
    static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addLast(15);
        ll.addLast(20);
        ll.addLast(14);
        ll.addLast(34);

        ll.dispaly();


        //Add node at first position
//        ll.addFirst(100);
//        ll.dispaly();

        //remove first node
//        ll.removeFirst();
//        ll.dispaly();

        Node valueAtIdx = ll.getAt(3);
        if(valueAtIdx != null) {
            System.out.println(valueAtIdx.data);
        }
    }
}
