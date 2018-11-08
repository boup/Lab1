import org.junit.Assert;
import org.junit.Test;

import java.io.PrintWriter;
import java.io.*;


public class InsertTest  {

    @Test
    public void testPesel() {
        Insert psl = new Insert("a","bb","ccc","90124500000");
        Assert.assertFalse(psl.isValid());//
    }
    @Test
    public void testPesel1()
    {
        Insert psl = new Insert("a","bb","ccc","90123100000");
        Assert.assertTrue(psl.isValid());
    }


}
