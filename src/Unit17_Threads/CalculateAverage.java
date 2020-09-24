package Unit17_Threads;

public class CalculateAverage implements Runnable{
    private double[] scores;

    public CalculateAverage(double[] scores) {
        this.scores = scores;
    }

    @Override
    public void run() {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score: " + scores[i]);
        }
    }
}
