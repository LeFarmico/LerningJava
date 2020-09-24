package Unit17_Threads;

import java.util.Random;

public class SortArray implements Runnable {
    int[] tenMilNumbers = new int[10000000];
    Random random = new Random();

    public int[] bubbleSort(int[] array){
        if (array.length <= 1)
            return array;
        boolean changed = false;
        while (changed){
            changed = false;
            for (int i = 0; i < array.length -1; i++) {
                if (array[i] > array[i+1]){
                    int tmp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = tmp;
                    changed = true;
                }
            }
        }
        return array;
    }
    @Override
    public void run() {

        for (int i = 0; i < tenMilNumbers.length; i++) {
            tenMilNumbers[i] = random.nextInt(10000000);
        }
        bubbleSort(tenMilNumbers);
    }
}
