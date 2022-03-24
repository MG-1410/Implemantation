package HashMap;

import HashMap.Hashmap;

public class Main{
    public static void main(String[] args) {
        Hashmap h = new Hashmap();
        h.put("Hi",1);
        h.put("de",2);
        h.put("Muthu",4);
        h.put("Hello",7);
        h.put("Helicopter",21);
        h.display();
        Hashmap n = new Hashmap();
        n.put("Hello",89);
        n.put("hehe",44);
        n.put("oi",13);
        n.display();
        h.remove("de");
        h.display();
        h.merge(h,n);
    }
}