package udaykant.unixtools;

import org.junit.Assert;

public class WCTest {
    @org.junit.Test
    public void testWordCount() throws Exception {
        WC wc = new WC();
        int  expected = 1;
        int actual= wc.wordCount("uday");
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void testCountCharacter() throws Exception {
        WC wc = new WC();
        int  expected = 9;
        int actual= wc.countCharacter("udaykant");
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void testCountLine() throws Exception {
        WC wc = new WC();
        int  expected = 1
                ;
        int actual= wc.countLine("udaykant");
        Assert.assertEquals(expected,actual);

    }
}
