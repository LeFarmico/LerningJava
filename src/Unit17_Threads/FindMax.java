package Unit17_Threads;

import java.util.Random;

public class FindMax implements  Runnable{
    int[] tenMilNumbers = new int[10000000];
    Random random = new Random();

    public int getMax(int[] array){
        int max = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
    @Override
    public void run() {
        for (int i = 0; i < tenMilNumbers.length; i++) {
            tenMilNumbers[i] = random.nextInt(10000000);
        }
        getMax(tenMilNumbers);
    }
}
