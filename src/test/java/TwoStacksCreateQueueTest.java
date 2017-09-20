import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoStacksCreateQueueTest {
    @Test
    public void shouldFIFO() throws Exception {
        MyQueue<Integer> myQueue = new MyQueue<>();
        ArrayList<Integer> integers = new ArrayList<>();
        myQueue.offer(2);
        integers.add(myQueue.poll());
        myQueue.offer(3);
        myQueue.offer(4);
        myQueue.offer(5);
        integers.add(myQueue.poll());
        myQueue.offer(8);
        integers.add(myQueue.poll());

        Integer[] expected = {2, 3, 4};

        List<Integer> expectedIntegers = Arrays.asList(expected);

        Assert.assertThat(integers, Is.is(expectedIntegers));
    }
}
