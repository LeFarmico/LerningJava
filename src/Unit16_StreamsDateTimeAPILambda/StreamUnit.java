import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamUnit {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");

        List<Double> list1 = Arrays.asList(117d, 12.2d, 66d, 18.5d);
        List<String> list2 = Arrays.asList("15", "18.5", "117", "22.2");

        Stream
                .concat(list1.stream(), list2.stream().map(Double::valueOf))
                .distinct().sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        IntStream intStream = IntStream.rangeClosed(1,100);
        int sum = intStream.skip(50).filter(x -> x % 2 == 0 || x % 5 == 0).sum();
        System.out.println(sum);
//        Stream<String> stringStream = list.stream();
//        Predicate<String> pred = x -> x.length() == 4;
//        stringStream
//                .filter(pred)
//                .sorted()
//                .limit(2)
//                .forEach(System.out::println);

        int mult = list.stream().mapToInt(x -> x.length()).reduce(1,(int1,int2) -> int1 * int2);
        System.out.println(mult);
    }
}
