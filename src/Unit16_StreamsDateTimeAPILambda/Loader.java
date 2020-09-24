import java.util.Optional;
import java.util.stream.Stream;

public class Loader {
    public static void main(String[] args) {

//        LocalDate date = LocalDate.of(2014, Month.JUNE,21);
//        System.out.println(date.toString());

        Stream<String> s = Stream.generate(() -> "meow");
        boolean match = s.allMatch(String::isEmpty);
        System.out.println(match);

//        Stream<Integer> infinite = Stream.iterate(2, x -> x * 2);
//        System.out.println(infinite.anyMatch(test -> test / 8 == 0));

//        Optional<Double> average = average(0);
//        System.out.println(average.orElse(Double.NaN));//при scores null вернет Nan = 0.0d
//        System.out.println(average.orElseGet(Math::random));//при scores null вернет random double
//        System.out.println(average.orElseThrow(IllegalStateException::new));//при scores null вернет IllegalStateException

//        Unit4 u4 = new Unit4(1);
//        Optional<String> op = u4.guessing();
//        op.ifPresent(System.out::println);


//        Unit2.doubleFromString(10, Double::valueOf);
//
//        Operationable operation;
//        operation = (val1,val2) -> val1+val2;
//
//        int result = operation.calculate(10,20);
//
//        System.out.println(test(operation));
//        System.out.println(test2(operation));
    }
    public static int test (Operationable operation){
        operation = ((val1, val2) -> val1+val2);
        return operation.calculate(10,20);
    }
    public static  int test2 (Operationable op){
        op = (val1, val2) -> val1-val2;
        return op.calculate(20,10);
    }
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty(); // строка 1
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length); // строка 2
    }
    private static String refactorText(String text) {
        if (text.length() >= 5) {
            return null;
        } else {
            return text + " refactored";
        }
    }
}
