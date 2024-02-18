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

    @Test
    public void testSubstitution() {
        Manager boss = new Manager("Boss", 35);

        Employee emp = boss;

        Assert.assertEquals("the results of show aren't equals", emp.show(), boss.show());

        Assert.assertEquals("The final keyword for methods does not prevent inheritance for methods, but I can not override it", emp.showAgain(), boss.showAgain());

        Employee emp2 = new Manager("Bob", 35);
        
        boolean theBonusIsSet = false;
        if (emp instanceof Manager chef) {
            chef.setBonus(1000);
            theBonusIsSet = true;
        }

        Assert.assertTrue("The bonus must be set", theBonusIsSet);
    }
}
