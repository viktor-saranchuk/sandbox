package assertions;

import org.junit.Test;

import assetrions.AssertionUsage;

public class AssertionUsageTest {
    
    @Test
    public void useTest() {
        Object obj = null;
        try {
            AssertionUsage.use(-1);
        } catch (AssertionError error) {
            obj = error;
        }

        assert obj != null;
        
    }
}
