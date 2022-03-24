package Queue;

public class Queue<T> {
    Node n = new Node();
    int size = 0;

    public void add(T val){
        Node node = new Node(val);
        if(n.head == null){
            node.next = null;
            n.head = node;
        }
        else{
            Node temp = n.head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            node.next = null;
        }
    }

    public T remove(){
        if(n.head == null){
            return null;
        }
        Node temp = n.head;
        n.head = n.head.next;
        return (T)temp.val;
    }

    public void display(){
        Node temp = n.head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println(" END ");
        System.out.println();
    }

    public boolean isEmpty(){
        if(n.head == null){
            return true;
        }
        return false;
    }

    public int size(){
        Node temp = n.head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }

    public int search(T val){
        int size = 0;
        Node temp = n.head;
        while(temp != null){
            size++;
            if(temp.val == val){
                return size;
            }
            temp = temp.next;
        }
        return -1;
    }

}
