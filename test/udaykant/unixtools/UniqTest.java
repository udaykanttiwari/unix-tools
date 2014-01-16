package udaykant.unixtools;

import junit.framework.Assert;
import org.junit.Test;

public class UniqTest {
    @org.junit.Test
    public void testDisplayUniqLines() throws Exception {
        String content = "uday\nuday\nkant\nuday";
        Uniq uniq = new Uniq();
        String expected = "\nuday\nkant\nuday";
        String actual = uniq.displayUniqLines(content);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testDisplayUniqLinesForNumber() throws Exception {
        String content = "1\n1\n1\n1";
        Uniq uniq = new Uniq();
        String expected = "\n\n\n1";
        String actual = uniq.displayUniqLines(content);
        Assert.assertEquals(expected,actual);
    }
}
