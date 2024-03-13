package collections;

import java.util.TreeSet;

public class CollectionsGame {
    public TreeSet<String> playWithTreeSets() {
        TreeSet<String> s = new TreeSet<String>();
        s.add("Bob");
        s.add("Null");
        s.add("null");
        s.add("Bob");
        s.add("Amy");
        return s;
    }
}
