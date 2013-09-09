import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Andrii
 * Date: 08.09.13
 * Time: 17:47
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.printStack();
    }
}
