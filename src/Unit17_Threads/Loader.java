public class Loader {
    public static void main(String[] args) {
        CalculateAverage calculateAverage = new CalculateAverage(new double[]{2d, 5.6d});
    Thread newThread = new Thread(calculateAverage);
    newThread.start();
    new ThreadExample().start();
    Thread thirdThread = new Thread(() -> System.out.println("третий поток"));
    thirdThread.start();
    }
}
