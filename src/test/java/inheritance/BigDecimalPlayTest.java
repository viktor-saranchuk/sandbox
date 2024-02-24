package inheritance;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class BigDecimalPlayTest {
    @Test
    public void testBigDouble() {
        BigDecimal bd1 = new BigDecimal("1.0");
        BigDecimal bd2 = new BigDecimal("1.00");

        Assert.assertFalse("BigDecimals should not be equal", bd1.equals(bd2));

        Assert.assertEquals("The result of compareTo method must be 0", 0, bd1.compareTo(bd2));
        
        Assert.assertTrue("The result of compareTo method must be 0.00", bd1.subtract(bd2).equals(new BigDecimal("0.00")));
    }
}
