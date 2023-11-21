package examples.java_core_4_6_7;

import java.util.Optional;
import java.util.stream.Stream;

public class example {

    void a() {
        Stream<Integer> numbersStream = Stream.of(1,2,3,4,5,6);
        Optional<Integer> result = numbersStream.reduce((x, y)->x*y);
        System.out.println(result.get());
    }


}
