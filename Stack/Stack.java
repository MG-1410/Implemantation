package stack;

public class Stack<T> {

    Node n = new Node();
    int size = 0;

    public void push(T val){
        Node node = new Node((T)val);
        if(n.head == null){
            n.head = node;
        }
        else{
            node.next = n.head;
            n.head = node;
        }
    }

    public T pop(){
        if(n.head == null){
            return null;
        }
        Node temp = n.head;
        n.head = n.head.next;
        return (T)temp.val;
    }

    public T peek(){
        if(n.head == null){
            System.out.println("Stack is Empty");
            return null;
        }
        return (T)n.head.val;
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
            if(temp.val.equals(val)){
                return size;
            }
            temp = temp.next;
        }
        return -1;
    }
}
