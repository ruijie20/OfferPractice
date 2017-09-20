import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoQueuesCreateStackTest {
    @Test
    public void shouldFirstInLastOut() throws Exception {
        MyStack<Integer> myStack = new MyStack<>();
        ArrayList<Integer> integers = new ArrayList<>();
        myStack.add(2);
        integers.add(myStack.push());
        myStack.add(3);
        myStack.add(4);
        myStack.add(5);
        integers.add(myStack.push());
        myStack.add(8);
        integers.add(myStack.push());

        Integer[] expected = {2, 5, 8};

        List<Integer> expectedIntegers = Arrays.asList(expected);

        Assert.assertThat(integers, Is.is(expectedIntegers));
    }
}
