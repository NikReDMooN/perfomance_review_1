package examples.java_core_4_6_12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class example {

    void a() {
        int sum = IntStream.range(1, 10)
                .sum();
        System.out.println(sum);

        List<Integer> evenInts = IntStream.rangeClosed(1, 10)
                .filter(i -> i % 2 == 0)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(evenInts.toArray()));
    }

}
