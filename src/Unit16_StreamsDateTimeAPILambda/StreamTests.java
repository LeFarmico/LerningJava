import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTests {
    public static void main(String[] args) {

        List<String> first = Arrays.asList("go", "to");
        List<String> second = Arrays.asList("the", "hollow");
        List<String> third = Arrays.asList("house", "bath");

        StringBuffer buffer = new StringBuffer("duck");
        final String duck = new String("duck");
        final String ck = "ck";
        Random random = new Random();
        List<Integer> numList = new ArrayList<Integer>();
        Stream<Integer> stream = numList.stream();
        Stream<String> stringStream = Stream.of("duck", duck , buffer.toString(), "du" + ck);
        Predicate<Integer> oddTest = x -> x % 2 == 0;

        Stream<List<String>> fullListStream = Stream.of(first, second, third);
        Stream<String> fullStringStream = fullListStream.flatMap(list->list.stream());

        fullStringStream.forEach(System.out::println);

        for (int i = 0; i < 100; i++) {numList.add(random.nextInt(100));}

      //  stream.filter(oddTest).forEach(System.out::println);
        stringStream.distinct().forEach(System.out::println);

    }
}
