class LinkedList<T>
{
    public class Node {
        public T val;
        public Node next;

        public Node() {
            val = null;
            next = null;
        }

        public Node(T v) {
            val = v;
            next = null;
        }

        public Node(T v, Node n) {
            val = v;
            next = n;
        }
    }
    private Node head;
    public LinkedList() {
        head=null;
        System.out.println("Linkedlist created\n");
    }
    public void insertAtBegin(T v) {
        if (head == null) {
            Node newnode = new Node(v);
            head = newnode;
        } else {
            Node newnode = new Node(v);
            newnode. next = head;
            head = newnode;

        }
    }

    public void insertAtEnd(T v)
    {
        if(head==null)
        {
            insertAtBegin(v);
        }
        else {
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=new Node(v);
        }
    }
    public void delete(T v)
    {
        if(head==null)
        {
            System.out.println("Linked List is empty\n");
        }
        else {
            Node current=head;
            Node previous=head;
            while(current.val!=v)
            {
                previous=current;
                current=current.next;
            }
            if(head.val==v)
            {
                head=head.next;
            }
            else if(current.val==v)
            {
                previous.next=current.next;
            }
        }
    }
    public void print()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.println(current.val);
            current=current.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> l1=new LinkedList<Integer>();

        l1.insertAtBegin(1);
        l1.insertAtBegin(2);
        l1.insertAtBegin(3);

        // l1.print();

        l1.insertAtEnd(4);
        l1.insertAtEnd(5);
        l1.insertAtEnd(6);

        //l1.print();

        l1.delete(2);

        l1.print();
    }
}