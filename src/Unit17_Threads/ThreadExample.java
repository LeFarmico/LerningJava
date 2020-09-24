public class ThreadExample extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Another thread: " + i);
        }
    }

}
