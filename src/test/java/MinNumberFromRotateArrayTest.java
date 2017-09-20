import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class MinNumberFromRotateArrayTest {
    @Test
    public void shouldReturnMinNumber() throws Exception {
        MinNumberFromRotateArray minNumberFromRotateArray = new MinNumberFromRotateArray();
        int[] ints = {3, 4, 6, 1, 2};
        int minNumber = minNumberFromRotateArray.min(ints);
        Assert.assertThat(minNumber, Is.is(1));
    }

    @Test
    public void shouldReturnMinNumberInThreeSameNumber() throws Exception {
        MinNumberFromRotateArray minNumberFromRotateArray = new MinNumberFromRotateArray();
        int[] ints = {3, 2, 3, 3, 3, 3};
        int minNumber = minNumberFromRotateArray.min(ints);
        Assert.assertThat(minNumber, Is.is(2));
    }

    @Test
    public void shouldReturnMinNumberInThreeSameNumber2() throws Exception {
        MinNumberFromRotateArray minNumberFromRotateArray = new MinNumberFromRotateArray();
        int[] ints = {2, 2, 2, 2, 1, 2};
        int minNumber = minNumberFromRotateArray.min(ints);
        Assert.assertThat(minNumber, Is.is(1));
    }

    @Test
    public void shouldReturnMinNumberInAscending() throws Exception {
        MinNumberFromRotateArray minNumberFromRotateArray = new MinNumberFromRotateArray();
        int[] ints = {1, 2, 3, 4, 5};
        int minNumber = minNumberFromRotateArray.min(ints);
        Assert.assertThat(minNumber, Is.is(1));
    }

    @Test
    public void shouldReturnMinNumberInSameTwoNumber() throws Exception {
        MinNumberFromRotateArray minNumberFromRotateArray = new MinNumberFromRotateArray();
        int[] ints = {3, 4, 5, 2, 3};
        int minNumber = minNumberFromRotateArray.min(ints);
        Assert.assertThat(minNumber, Is.is(2));
    }
}
