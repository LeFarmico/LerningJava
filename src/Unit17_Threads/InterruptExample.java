package Unit17_Threads;

public class InterruptExample {

    public static void main(String[] args) throws InterruptedException { // 4
        Thread threadToInterrupt = new Thread(() -> {
            while (true) {
                System.out.println("Working hard");
                try {
                    Thread.sleep(1000); // 1
                } catch (InterruptedException e) {
                    System.out.println("Interrupted!");
                    break; // 2
                }
            }
        });

        threadToInterrupt.start();
        threadToInterrupt.join(5000); // 3
        threadToInterrupt.interrupt(); // 5
    }
}
