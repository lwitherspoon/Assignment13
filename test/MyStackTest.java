import org.junit.Test;
import static org.junit.Assert.*;

public class MyStackTest {
    private MyStack stack = new MyStack();

    @Test
    public void main() throws CloneNotSupportedException {

        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Confirm basic methods work as expected
        assertEquals("Size of stack is incorrect", stack.getSize(), 3);
        assertEquals("Last item in stack is incorrect", stack.peek(), 3);
        assertEquals("msg", "3", stack.pop().toString());

        MyStack stack2 = (MyStack)stack.clone();

        // Confirm clone method works as expected
        assertEquals("Did not clone properly", "[1, 2]", stack2.toString());

    }

}