package collections;

import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

public class ColectionsGameTest {
    @Test
    public void testPlayWithTreeSets() {
        CollectionsGame game = new CollectionsGame();

        TreeSet<String> s = game.playWithTreeSets();

        Assert.assertEquals(4, s.size());
    }
}
