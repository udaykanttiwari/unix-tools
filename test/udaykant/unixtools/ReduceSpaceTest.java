package udaykant.unixtools;

import org.junit.Assert;

public class ReduceSpaceTest {
    @org.junit.Test
    public void testReduceSpace_for_single_line() throws Exception {
        String expected = "uday kant tiwari";
        ReduceSpace rs = new ReduceSpace();
        String actual= rs.reduceSpace("uday     kant    tiwari");
        Assert.assertEquals(expected,actual);
    }
    @org.junit.Test
    public void testReduceSpace_for_multiline_content() throws Exception {
        String expected = "uday kant tiwari\nharjas singh";
        ReduceSpace rs = new ReduceSpace();
        String actual= rs.reduceSpace("uday     kant    tiwari\nharjas      singh");
        Assert.assertEquals(expected,actual);
    }
}
