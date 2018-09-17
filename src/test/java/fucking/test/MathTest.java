package fucking.test;

import org.junit.Assert;
import org.junit.Test;

public class MathTest {

    @Test
    public void testItCanSum() throws AssertionError {

        Assert.assertEquals(4,Math.sum(1,3).intValue());
        Assert.assertTrue(Math.sum(1,0) > 0);

    }
}
