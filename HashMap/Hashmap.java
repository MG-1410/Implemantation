package HashMap;

import java.util.LinkedList;


public class Hashmap {

    Node n = new Node();

    public void put(String k ,int v){
        Node node = new Node(k,v);
        Node temp = n.head;
        if(n.head == null){
            n.head = node;
            n.head.next = null;
        }
        else {
            while (temp.next != null) {
                temp = temp.next;
            }
            node.next = null;
            temp.next = node;
        }
    }

    public int get(String k){
        int i = n.hash(k);
        Node temp = n.head;
        while(temp.next != null){
            temp = temp.next;
            if(k.equals(temp.k)){
                return temp.v;
            }
        }
        return -1;
    }

    public int remove(String k){
        int i = n.hash(k);
        Node temp = n.head;
        Node temp1 = null;
        while(temp.next != null){
            temp1 = temp;
            temp = temp.next;
            if(k.equals(temp.k)){
                temp1.next = temp.next;
                return temp.v;
            }
        }
        return -1;
    }

    public boolean containsKey(String k){
        int i = n.hash(k);
        Node temp = n.head;
        while(temp.next != null) {
            temp = temp.next;
            if (k.equals(temp.k)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(int v){
        Node temp = n.head;
        while(temp.next != null) {
            temp = temp.next;
            if (v == temp.v) {
                return true;
            }
        }
        return false;
    }

    public int size(){
        int size = 0;
        Node temp = n.head;
        while(temp != null) {
            temp = temp.next;
            size++;
            }
        return size;
        }

    public LinkedList getKeys(){
        LinkedList l = new LinkedList();
        Node temp = n.head;
        while(temp != null){
            l.push(temp.k);
            temp = temp.next;
        }
        return l;
    }

    public LinkedList getValues(){
        LinkedList l = new LinkedList();
        Node temp = n.head;
        while(temp != null){
            l.push(temp.v);
            temp = temp.next;
        }
        return l;
    }

    public void merge(Hashmap k,Hashmap g){
        Node temp = k.n.head;
        while(temp.next != null){
            Node node = g.n.head;
            Node n1 = null;
            while(node.next != null){
                n1 = node;
                if(temp.k.equals(node.k)){
                    temp.v = node.v;
                    n1.next = node.next;
                }
                node = node.next;
            }
            temp = temp.next;
        }
        Node d = g.n.head;
        while(d.next != null){
            temp.next = d;
            d = d.next;
        }
        Node a = k.n.head;
        while(a != null){
            System.out.print(a.k + " = " + a.v + " -> ");
            a = a.next;
        }
        System.out.println("END");
        System.out.println();
    }

    public void display(){
        Node temp = n.head;
        while(temp != null){
            System.out.print(temp.k + " = " + temp.v + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

}
