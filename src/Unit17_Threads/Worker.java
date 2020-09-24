package Unit17_Threads;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private List<String> list1 = new ArrayList<>();
    private List<String> list2 = new ArrayList<>();

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    private void addToListOne() {
        try {
            Thread.sleep(1); // имитируем работу потока, занимающую 1 мс
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        synchronized (lock1){
            list1.add("Hello"); // добавляем в первый лист значение
        }
    }

    private void addToListTwo() {
        try {
            Thread.sleep(1); // имитируем работу потока, занимающую 1 мс
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        synchronized (lock2){
            list2.add("Hello"); // добавляем во второй лист значение
        }
    }

    private void process() {
        for (int i = 0; i < 1000; i++) { // 1000 раз вызываем оба метода
            addToListOne();
            addToListTwo();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker(); // строка 1

        Thread t1 = new Thread(worker::process);

        Thread t2 = new Thread(worker::process);

        long start = System.currentTimeMillis();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long finish = System.currentTimeMillis();

        System.out.println("list 1 size is: " + worker.list1.size());
        System.out.println("list 2 size is: " + worker.list2.size());

        System.out.println("Time taken: " + (finish - start) +
                " ms"); // замеряем время выполнения
    }
}
