public class Test {
    public static void doTrap(){
        while (true){
            if(Thread.currentThread().isInterrupted()){
                System.out.println("isInterrupted");
                return;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(Test::doTrap);
        thread.start();
        thread.interrupt();
        System.out.println(thread.getState().toString());
        Thread.sleep(1000);
        System.out.println(thread.getState().toString());
    }
}
