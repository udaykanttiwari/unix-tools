package udaykant.unixtools;

import junit.framework.Assert;

public class SortTest {
    @org.junit.Test
    public void testSortWithoutOption() throws Exception {
        String content = "uday\nkant\ntiwari";
        String expected = "kant\ntiwari\nuday\n";
        Sort sort = new Sort();
        String actual= sort.sortWithoutOption(content);
        Assert.assertEquals(expected,actual);
    }
}
