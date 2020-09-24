package Unit17_Threads;

import java.util.ArrayList;
import java.util.List;

public class DeleteFromArray implements Runnable {
    List list = new ArrayList();


    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        for (int i = 10000000; i < 1; i--) {
            list.remove(i);
        }
    }
}
