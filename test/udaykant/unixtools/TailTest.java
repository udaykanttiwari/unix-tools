package udaykant.unixtools;

import junit.framework.Assert;

public class TailTest {
    @org.junit.Test
    public void testDisplayTail() throws Exception {
        String content = "hello\nhow\nare\nyou\nuday\nabc\najay\nrahul\nvikram\nvidesh\nag\nff\njfff";
        String expected = "you\nuday\nabc\najay\nrahul\nvikram\nvidesh\nag\nff\njfff\n";
        Tail tail = new Tail();
        String actual= tail.DisplayTail(content);
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void testDisplayTailLines() throws Exception {
        String content = "hello\nhow\nare\nyou\nuday\nabc\najay\nrahul\nvikram\nvidesh\nag\nff\njfff";
        String expected = "ff\njfff\n";
        Tail tail = new Tail();
        String actual= tail.DisplayTailLines(content,2);
        Assert.assertEquals(expected,actual);

    }
}
