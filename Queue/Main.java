package Queue;

public class Main {
    public static void main(String[] args) {
        Queue a = new Queue();
        a.add(10);
        a.add(20);
        a.add("Hello");
        a.add(30);
        a.add(40);
        a.add(50);
        System.out.println(a.remove());
        a.display();
    }
}
