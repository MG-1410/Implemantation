package HashMap;

class Node {
    int i ;
    String k;
    int v;
    Node next;

     Node head;

    Node(String k, int v) {
        this.k = k;
        this.v = v;
        this.i = hash(k);
    }

    public int hash(String k){
        if(k.length() <= 3){
            return i = 1;
        }else if(k.length() <= 6){
            return i = 2;
        }
        else if(k.length() <= 10){
            return i = 3;
        }
        return 4;
    }

    Node(){
    }
}
