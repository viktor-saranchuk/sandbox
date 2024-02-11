package encapsulation;

import org.junit.Assert;
import org.junit.Test;

public class ManagerTest {
    @Test
    public void testAccessLevels() {

        Manager.CEO ceo = new Manager.CEO();

        Assert.assertEquals("CEO is not accessible", "CEO", ceo.name);

        Manager man = new Manager();
        Manager.CTO cto = man.new CTO();

        Assert.assertEquals("CTO is not accessible", "CTO", cto.name);

        man = null;
        Assert.assertEquals("CTO is not accessible", "CTO", cto.name);
    }
}
