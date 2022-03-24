package stack;

public class Main {
    public static void main(String[] args) {
        Stack n = new Stack();
        n.push(10);
        n.push(20);
        n.push(30);
        n.push("Hey");
        n.display();
        System.out.println(n.peek());
        System.out.println(n.pop());
        n.display();
    }
}
