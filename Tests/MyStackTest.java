import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Andrii
 * Date: 10.09.13
 * Time: 0:35
 * To change this template use File | Settings | File Templates.
 */

public class MyStackTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testPush() throws Exception {
        MyStack stack = new MyStack();

        stack.push(1);
        assertTrue(stack.elements.size() == 1);

        stack.push(2);
        stack.push(3);
        stack.push(4);

        exception.expect(StackOverflowError.class);
        stack.push(5);
    }

    @Test
    public void testPop() throws Exception {
        MyStack stack = new MyStack();

        assertTrue(stack.elements.size() == 0);

        exception.expect(EmptyStackException.class);
        stack.pop();
    }
}
