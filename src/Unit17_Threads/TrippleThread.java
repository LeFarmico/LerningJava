package Unit17_Threads;

public class TrippleThread {
    public static void main(String[] args) throws InterruptedException {
        FindMax findMax = new FindMax();
        SortArray sortArray = new SortArray();
        DeleteFromArray deleteFromArray = new DeleteFromArray();
        Thread first = new Thread(findMax);
        Thread second = new Thread(sortArray);
        Thread third = new Thread(deleteFromArray);

        long startTime = System.currentTimeMillis();
        first.start();
        second.start();
        third.start();

        first.join();
        second.join();
        third.join();
        long finishTime = System.currentTimeMillis();
        System.out.println("Total time: " + (finishTime - startTime));
    }
}
