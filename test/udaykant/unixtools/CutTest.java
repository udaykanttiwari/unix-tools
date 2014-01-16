package udaykant.unixtools;

import junit.framework.Assert;
import org.junit.Test;

public class CutTest {
    @Test
    public void test_cut_by_second_field() throws Exception {
        Cut cut = new Cut();
        String expected = "kant\n";
        String actual= cut.cutByField("uday kant tiwari",2," ");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_cut_by_second_field_for_multiline_string() throws Exception {
        Cut cut = new Cut();
        String content = "uday kant tiwari\nguru manish uday";
        String expected = "kant\nmanish\n";
        String actual= cut.cutByField(content,2," ");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_cut_if_field_is_not_availble() throws Exception {
        Cut cut = new Cut();
        String content = "uday kant tiwari\nguru manish uday";
        String expected = "";
        String actual= cut.cutByField(content,4," ");
        Assert.assertEquals(expected,actual);
    }
}
