package udaykant.unixtools;


import junit.framework.Assert;
import org.junit.Test;

public class HeadTest {
    @Test
    public void testDisplayCharacters() throws Exception {
        Head head = new Head();
        String Expected = "hello";
        String Actual = head.DisplayCharacters("hello who are you", 5);
        Assert.assertEquals(Expected, Actual);
    }

    @Test
    public void testDisplayLines() throws Exception {
        Head head = new Head();
        String content = "hello\nhow\nare\nyou\nuday";
        String Expected = "\nhello\nhow\nare";
        String Actual = head.DisplayLines(content, 3);
        Assert.assertEquals(Expected, Actual);
    }

    @Test
    public void testDisplayHead() throws Exception {
        Head head = new Head();
        String content = "hello\nhow\nare\nyou\nuday\nabc\najay\nrahul\nvikram\nvidesh\nag\nff\njfff";
        String Expected = "\nhello\nhow\nare\nyou\nuday\nabc\najay\nrahul\nvikram\nvidesh";
        String Actual = head.DisplayHead(content);
        Assert.assertEquals(Expected, Actual);
    }
}
