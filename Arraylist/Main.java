package ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.set(5,60);
        System.out.println(l.get(4));
        l.remove(40);
        System.out.println("The size is: " + l.size());
        System.out.println(l);
    }
}
