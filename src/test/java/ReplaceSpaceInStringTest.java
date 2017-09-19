import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class ReplaceSpaceInStringTest {
    @Test
    public void shouldReplaceSpaceInString() throws Exception {
        ReplaceSpaceInString replaceSpaceInString = new ReplaceSpaceInString();
        String s = replaceSpaceInString.replaceSpace("hello dog! ");
        Assert.assertThat(s, Is.is("hello20%dog!20%"));
    }

    @Test
    public void shouldReplaceSpaceInStringWithSpaceAtBeginning() throws Exception {
        ReplaceSpaceInString replaceSpaceInString = new ReplaceSpaceInString();
        String s = replaceSpaceInString.replaceSpace(" hello dog!");
        Assert.assertThat(s, Is.is("20%hello20%dog!"));
    }

    @Test
    public void shouldReturnOriginalStringWithoutSpace() throws Exception {
        ReplaceSpaceInString replaceSpaceInString = new ReplaceSpaceInString();
        String s = replaceSpaceInString.replaceSpace("hello!");
        Assert.assertThat(s, Is.is("hello!"));
    }

    @Test
    public void shouldReturnNullWhenIsNull() throws Exception {
        ReplaceSpaceInString replaceSpaceInString = new ReplaceSpaceInString();
        String s = replaceSpaceInString.replaceSpace(null);
        Assert.assertNull(s);
    }

    @Test
    public void shouldReturnEmptyString() throws Exception {
        ReplaceSpaceInString replaceSpaceInString = new ReplaceSpaceInString();
        String s = replaceSpaceInString.replaceSpace("");
        Assert.assertThat(s, Is.is(""));
    }
}
