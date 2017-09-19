import org.junit.Assert;
import org.junit.Test;

public class FindNumberFromDimensionTwoArrayTest {

    private final int[][] matrix = new int[][]{
            {1, 2, 7, 10, 11},
            {2, 4, 8, 12, 13},
            {4, 7, 10, 13, 14},
            {6, 8, 11, 15, 16},
            {7, 10, 12, 16, 17}
    };

    @Test
    public void shouldReturnTrueWhenSearchExistNumber() throws Exception {

        FindNumberFromDimensionTwoArray findNumberFromDimensionTwoArray = new FindNumberFromDimensionTwoArray();

        Assert.assertTrue(findNumberFromDimensionTwoArray.find(matrix, 2));

        Assert.assertTrue(findNumberFromDimensionTwoArray.find(matrix, 10));
    }

    @Test
    public void shouldReturnFalseWhenSearchNotExistNumber() throws Exception {

        FindNumberFromDimensionTwoArray findNumberFromDimensionTwoArray = new FindNumberFromDimensionTwoArray();

        Assert.assertFalse(findNumberFromDimensionTwoArray.find(matrix, 9));

        Assert.assertFalse(findNumberFromDimensionTwoArray.find(matrix, 18));
    }
}
