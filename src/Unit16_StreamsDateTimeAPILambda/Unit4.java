import java.util.Optional;
import java.util.Random;

public class Unit4 {
    static int guess = 0;

    public Unit4(int guess) {
        this.guess = guess;
    }

    public static Optional<String> guessing(){
        if (guess > 5 || guess < 1)
            throw new IllegalStateException();
        Random random = new Random();
        int randomInt = random.nextInt(4) + 1;
        if (guess == randomInt)
            return Optional.of("Поздравляем! Вы угадали значение!");
        else
            return Optional.empty();
    }
}
