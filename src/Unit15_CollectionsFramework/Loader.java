package Unit15_CollectionsFramework;

import java.util.*;

public class Loader {
    public static void main(String[] args) {

        Sorted s1 = new Sorted(88, "a");
        Sorted s2 = new Sorted(55,"b");

        TreeSet<Sorted> set = new TreeSet<>();

        set.add(s1);
        set.add(s2);

        TreeSet<Sorted> set2 = new TreeSet<>(s1);

        set2.add(s1);
        set2.add(s2);

        System.out.println(set + " " + set2);
    }
}
