package Unit17_Threads;

import java.util.HashSet;
import java.util.Set;

public class ForQ {
    private Set<String> intSet = new HashSet<>();

    private synchronized void addElemToSet() {
        intSet.add("Hello");
    }

    private synchronized void removeElemToSet() {
        intSet.remove("Hello");
    }

    public static void main(String[] args) throws InterruptedException {
        ForQ main = new ForQ();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                main.addElemToSet();
                System.out.println(main.intSet.size());
            }
        });

        Thread t2 = new Thread(main::removeElemToSet);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Set size: " + main.intSet.size());
    }
}
