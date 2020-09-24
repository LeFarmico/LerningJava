import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainThread {


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] tenMilNumbers = new int[10000000];
        int[] tenMilNumbers2 = new int[10000000];
        List list = new ArrayList();
        Random random = new Random();

        for (int i = 0; i < tenMilNumbers.length; i++) {
            tenMilNumbers[i] = random.nextInt(10000000);
        }
        getMax(tenMilNumbers);

        for (int i = 0; i < tenMilNumbers2.length; i++) {
            tenMilNumbers2[i] = random.nextInt(10000000);
        }
        bubbleSort(tenMilNumbers);

        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        for (int i = 10000000; i < 1; i--) {
            list.remove(i);
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("Total time: " + (finishTime - startTime));
    }
    public static int getMax(int[] array){
        int max = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
    public static int[] bubbleSort(int[] array){
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
}
